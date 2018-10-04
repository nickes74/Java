// ==========================================================================
// Classe ControleurServeur    
// --------------------------------------------------------------------------
// Controle (demarrage et arret) du programme serveur.
// ==========================================================================

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilitairesMG.jdbc.*;
import utilitairesMG.divers.*;
import utilitairesMG.graphique.LF;

public class ControleurServeur
{

    private static ServeurObjets serveur;
    private static BaseDeDonnees base;
    private static Fenetre maFenetre;

    public static void main(String[] argv) throws IOException
    {

// --------------------------------------------------------------------------
// Chargement du driver SQL
// --------------------------------------------------------------------------
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

// --------------------------------------------------------------------------
// Base de donnees utilisee par le serveur, ouverture de la connexion
// --------------------------------------------------------------------------
            base = new BaseDeDonnees("jdbc:sqlserver://mars;user=UTIL_BIP;"
                    + "password=x;databasename=gnmi");
            base.setFormatDate("dd/MM/yyyy");

// --------------------------------------------------------------------------
// Lancement du serveur
// --------------------------------------------------------------------------
            javax.swing.SwingUtilities.invokeLater(new Runnable()
            {
                @Override
                public void run()
                {
                    LF.setLF();
                    try
                    {
                        maFenetre = new Fenetre("Serveur d'objets");
                    } catch (IOException ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                }
            }
            );

            //maFenetre = new Fenetre("Serveur d'objets");
        } catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void arreter()
    {
        System.exit(0);
    }

    public static void demarreServeur()
    {
        serveur = new ServeurObjets(base);
        serveur.start();
        System.out.println("Le serveur a démarré...");
    }

    public static void arreteServeur()
    {
        serveur.interrupt();
        System.out.println("Le serveur a été arrété...");
    }

    public static void infoServeur(Socket socketClient, String texteRequete)
    {
        Fenetre.afficheServeur(socketClient, texteRequete);
    }

}
