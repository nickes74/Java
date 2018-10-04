import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.io.*;
import utilitairesMG.divers.*;
       
public class ExoFluxNomsTries
{
    public static void main(String[] args) throws IOException
    {
        File dossier;
        File fichierEntree;
        File fichierSortie;
        BufferedReader entree;
        PrintWriter sortie;
        
        String ligne;
        
        Vector<Contact>vContact;
        vContact = new Vector<Contact>();        
        
        dossier = new File("U:\\JAVA\\TP");
        fichierEntree = new File(dossier,"contacts.txt");
        fichierSortie = new File(dossier, "contactsTries.txt");
        
        try
        {
           entree = new BufferedReader (new InputStreamReader (new FileInputStream(fichierEntree),"Cp1252")); 
           
           try{
               sortie = new PrintWriter(fichierSortie, "Cp1252");
               
               try{
                   
                   ligne = entree.readLine();
                   
                   while (ligne != null)
                   {
                        vContact.add(new Contact(ligne));            
                        ligne = entree.readLine();
                   }
                   Collections.sort(vContact);  
                   for (int i = 0; i < vContact.size(); i++)
                   {
                       sortie.println(vContact.get(i));
                   }

               }
               finally{
                  sortie.close(); 
               }
           }
           finally{
               entree.close();
           }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Le fichier " + fichierEntree.getName() + " est inconnu");
        }
        
    }
    
}
