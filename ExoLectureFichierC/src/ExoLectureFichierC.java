import java.io.*;



public class ExoLectureFichierC
{


    public static void main(String[] args) throws IOException
    {
        File dossier;
        File fichierEntree;
        FichierContactsBinaireC entree;
        
        Contact contact = new Contact();
        
        dossier = new File("R:\\JAVA\\Fichiers");
        fichierEntree = new File(dossier, "contacts.dat");
        
        try
        {
            
            entree = new FichierContactsBinaireC(fichierEntree, "r" , 108);
            try
            {   
                
            do
            {
                entree.defContact(contact);
                System.out.println(contact);

            } while (true);   
          
            }
            catch(EOFException e)
            {
                System.out.println("Fin de fichier");
            }
            finally
            {
                entree.close();
            }
            
           
        } catch (FileNotFoundException e)
        {
            System.out.println("Ficher non trouve");
        }
    }
    
}
