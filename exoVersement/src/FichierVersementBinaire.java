
import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;

import utilitairesMG.divers.*;


public class FichierVersementBinaire extends Fichier
{
     Versement versement2;
     private String mot;
     private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
     
    public FichierVersementBinaire(String nom, String mode, int tailleEnreg)throws IOException
   {
       super(nom, mode, tailleEnreg);
   }  
     
     public FichierVersementBinaire(File fichier, String mode, int tailleEnreg)throws IOException
   {
       super(fichier, mode, tailleEnreg);
   }      
        
    public void defVersement(Versement versement2)throws IOException
    {              
        writeInt(versement2.getNumero());
        mot = formatter.format(versement2.getDate());
        writeString(mot,11);
        writeDouble(versement2.getMontant());
        writeInt(versement2.getNumContact());
   }      
}
