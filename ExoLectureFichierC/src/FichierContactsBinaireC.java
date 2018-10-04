
import java.io.IOException;
import java.io.*;
import utilitairesMG.divers.*;


public class FichierContactsBinaireC extends Fichier
{
   
    Contact contact;
    
   public FichierContactsBinaireC(String nom, String mode, int tailleEnreg)throws IOException
   {
       super(nom, mode, tailleEnreg);
   }   
       
    public FichierContactsBinaireC(File fichier, String mode, int tailleEnreg)throws IOException
   {
       super(fichier, mode, tailleEnreg);
   }       
       
    public void defContact(Contact contact) throws IOException
    {              
        contact.setNumero(this.readIntC());                              
        contact.setNom(this.readString(21));
        contact.setAdresse(this.readString(51));
        contact.setCodePostal(this.readString(6));
        contact.setVille(this.readString(22));
        contact.setCodeSecteur(this.readIntC());                 
   }        
}
