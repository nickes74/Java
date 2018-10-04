import java.io.*;

public class ExoFichersNotes
{
    public static void main(String[] args) throws IOException
    {
        File dossier;
        File fichierEntree;
        File fichierSortie;
        
        BufferedReader entree;
        PrintWriter sortie;
        
        String  chaine;
        int somme = 0;
        int i = 0;
        
        dossier = new File("U:\\JAVA\\TP");
        fichierEntree = new File(dossier, "notes.txt");
        fichierSortie = new File(dossier, "notesTraitees.txt");
        
        try
        {
          entree = new BufferedReader(new InputStreamReader(new FileInputStream(fichierEntree), "Cp1252"));
          sortie = new PrintWriter(fichierSortie, "Cp1252");
            try
            {
                while (true)
                {                   
                    chaine = entree.readLine();
                    String[] result = chaine.split(";");
                    for (int x = 1; x < result.length; x++)
                    {
                         somme += Integer.parseInt(result[x]);
                         i ++;
                    }
                    sortie.println("Le total des " + i + " notes de " + result[0] + " est de : " + somme); 
                    i=0;
                    somme = 0;
                }
            } catch (EOFException e)
            {
            }
            finally{
                entree.close();
                sortie.close();
            }
          
        } catch (Exception e)
        {
        }
        finally
        {
            System.out.println("*** Fichier texte créé ***");
        }
    }
    
}
