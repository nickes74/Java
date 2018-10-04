
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Clavier
{
          
       public static String readString() throws IOException
       {    
        BufferedReader entree = new BufferedReader(new InputStreamReader(System.in, "Cp1252"));
        String chaine = "";
        
        try{
        
        chaine = entree.readLine();
        }
        catch (IOException e)
        {
            System.out.println("Erreur de saisie");
        }
                
        return chaine;
       }
       
       public static int readInt () throws Exception
       {
           
        BufferedReader entree = new BufferedReader(new InputStreamReader(System.in, "Cp1252"));
        int nombre = 0;
        String chaine = "";
        
        try{
        
        chaine = entree.readLine();
        nombre = Integer.parseInt(chaine);
        }
        catch (IOException e)
        {
            System.out.println("Erreur de saisie");
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Erreur de saisie");
        }
       
        
        return nombre; 
       }
       
       public static double readDouble () throws IOException
       {
           
        BufferedReader entree = new BufferedReader(new InputStreamReader(System.in, "Cp1252"));
        double doub = 0;
        String chaine = "";
        
        try{
       
        chaine = entree.readLine();
        doub = Double.parseDouble(chaine);
        }
        catch (IOException e)
        {
            System.out.println("Erreur de saisie");
        }
         catch (NumberFormatException nfe)
        {
            System.out.println("Erreur de saisie");
        }
        
        return doub; 
       }
       
       
}
