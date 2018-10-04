// ==========================================================================
// Classe AccesServeur
// --------------------------------------------------------------------------
// Un objet AccesBase permet d'obtenir un acc�s au ServeurObjets.
// ==========================================================================
package daoServeurXML;

import java.io.*;
import java.net.*;
import java.util.Vector;
import javax.xml.parsers.*;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import utilitairesMG.jdbc.JeuResultat;
import utilitairesMG.jdbc.JeuResultatXML;
import org.w3c.dom.*;
import utilitairesMG.divers.Colonne;

public class AccesServeur
{

    private PriseServeur prise;
    private Socket socketClient;
    private InputStreamReader entree;
    private PrintWriter sortie;
    private InputSource source;
    private Vector<Colonne> listeCol;
    private Vector<Object> listeLigne;

// --------------------------------------------------------------------------
// Constructeur
// --------------------------------------------------------------------------
    public AccesServeur(PriseServeur prise)
    {
        this.prise = prise;
    }

    public PriseServeur getPrise()
    {
        return prise;
    }

// --------------------------------------------------------------------------
// Methode d'ouverture d'une connexion (socket) au ServeurObjets
// --------------------------------------------------------------------------
    public Socket getConnection() throws IOException
    {
        socketClient = new Socket(prise.getNomMachine(),
                prise.getNumeroPort());

        sortie = new PrintWriter(new OutputStreamWriter(socketClient.getOutputStream(), "utf-8"), true);
        entree = new InputStreamReader(socketClient.getInputStream(), "utf-8");

        source = new InputSource(entree);

        return socketClient;
    }

// --------------------------------------------------------------------------
// Methode de fermeture de la connexion
// --------------------------------------------------------------------------
    public void closeConnection() throws IOException
    {
        if ((socketClient != null) && (!socketClient.isClosed()))
        {
            socketClient.close();
        }
    }

// --------------------------------------------------------------------------
// executeQuery (SELECT)
// --------------------------------------------------------------------------
// Cette methode retourne le jeu de resultats obtenu par le Select
// --------------------------------------------------------------------------
    public JeuResultat executeQuery(String requete)
            throws IOException, ClassNotFoundException, ParserConfigurationException, SAXException
    {
        JeuResultat jeuResultat;
        JeuResultatXML resultatXML;
        Document docum;
        DocumentBuilderFactory usineParserXML;
        DocumentBuilder parserXML;
        Element racine;
        NodeList famille, colonne, ligne;
        Node enfant;

        usineParserXML = DocumentBuilderFactory.newInstance();
        usineParserXML.setIgnoringComments(true);
        usineParserXML.setIgnoringElementContentWhitespace(true);
        usineParserXML.setValidating(true);
        
        listeCol = new Vector<Colonne>();
        listeLigne = new Vector<Object>();
// --------------------------------------------------------------------------
// Cas de la requete vide.
// --------------------------------------------------------------------------
        if (requete.compareTo("") == 0)
        {
            throw new IOException("Requete vide");
        }

// --------------------------------------------------------------------------
// Ouverture de la connexion avec le serveur JDBC.
// --------------------------------------------------------------------------
// Il faut ouvrir (et fermer) la connexion a chaque appel (executeQuery ou
// executeUpdate), a cause de la conception du serveur d'objets...
// --------------------------------------------------------------------------
// En effet, dans le serveur, le thread client ouvre une socket a la
// reception de la requete (accept), exécute le requete, envoie le resultat,
// et FERME la socket.
// --------------------------------------------------------------------------
        getConnection();

// --------------------------------------------------------------------------
// Envoi de la requete vers le serveur.
// --------------------------------------------------------------------------
        sortie.println(requete);

        parserXML = usineParserXML.newDocumentBuilder();

        docum = parserXML.parse(source);

        racine = docum.getDocumentElement();
        colonne = racine.getElementsByTagName("COLONNE");
        ligne = racine.getElementsByTagName("LIGNE");

        return jeuResultat;
    }

    private static class InputStreamImpl extends InputStream
    {

        public InputStreamImpl(InputStreamReader entree)
        {
            super(entree);
        }

        @Override
        public int read() throws IOException
        {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

}

// --------------------------------------------------------------------------
// executeUpdate (INSERT, DELETE, UPDATE)
// --------------------------------------------------------------------------
// Cette methode retourne le nombre de lignes concernees par la requete
// --------------------------------------------------------------------------
public Integer executeUpdate(String requete)
        throws IOException, ClassNotFoundException
    {
        Integer codeRetour;
        String messageErreur;

// --------------------------------------------------------------------------
// Cas de la requete vide.
// --------------------------------------------------------------------------
        if (requete.compareTo("") == 0)
        {
            throw new IOException("Requete vide");
        }

// --------------------------------------------------------------------------
// Ouverture de la connexion avec le serveur JDBC.
// --------------------------------------------------------------------------
        getConnection();

        try
        {

// --------------------------------------------------------------------------
// Envoi de la requete vers le serveur.
// --------------------------------------------------------------------------
            sortie.println(requete);

            codeRetour = Integer.parseInt(entree.readLine());

            if (codeRetour == 0)
            {
                messageErreur = (String) entree.readLine();
                throw new IOException(messageErreur);
            }
            else
            {
                codeRetour = Integer.parseInt(entree.readLine());
                return codeRetour;
            }
        }
        finally
        {
            closeConnection();
        }
    }
}
