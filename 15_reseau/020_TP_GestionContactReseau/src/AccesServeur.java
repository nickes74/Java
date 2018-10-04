
import java.io.*;
import java.net.Socket;
import javax.imageio.IIOException;
import utilitairesMG.jdbc.JeuResultat;


class AccesServeur
{
    
    private static Socket socketClient;
    private final PriseServeur serveur;
    private JeuResultat resultat;
    private Integer result;
    private ObjectInputStream entree;
    private ObjectOutputStream sortie;

    AccesServeur(PriseServeur serveur)
    {
        this.serveur = serveur;
    }
    
    public Socket getConnection() throws IOException
    {
        socketClient = new Socket(serveur.getNomMachine(), serveur.getNumeroPort());
        
        sortie = new ObjectOutputStream(socketClient.getOutputStream());
        entree = new ObjectInputStream(socketClient.getInputStream());
       
        return socketClient;
    }
    
    public void closeConnection() throws IOException
    {
        socketClient.close();
    }
    
    public JeuResultat executeQuery(String select) throws  IOException, ClassNotFoundException
    {
        if (select.compareTo("") == 0)
        {
            throw new IOException("Requete vide");
        }
        getConnection();
        try
        {
            sortie.writeObject(select);
            
            int nb = (Integer)entree.readObject();
            
            if (nb == 0)
            {
                String mess = (String)entree.readObject();
                throw new IIOException(mess);
            }else
            {
                resultat = (JeuResultat)entree.readObject();
            }           
        } finally
        {
            closeConnection();
        }
            

        return resultat;
    }
    
    public Integer executeUpdate(String select) throws IOException, ClassNotFoundException
    {
if (select.compareTo("") == 0)
        {
            throw new IOException("Requete vide");
        }
        getConnection();
        try
        {
            sortie.writeObject(select);
            
            int nb = (Integer)entree.readObject();
            
            if (nb == 0)
            {
                String mess = (String)entree.readObject();
                throw new IIOException(mess);
            }else
            {
                result = (Integer)entree.readObject();
            }           
        } finally
        {
            closeConnection();
        }
                
        return result;
    }
    
    public PriseServeur getServeur()
    {
        return serveur;
    }
}
