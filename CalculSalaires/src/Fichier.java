import java.util.*;
import java.io.*;


public class Fichier
{
    private static File dossier;
    private static File fichierEntree;
    
    private static BufferedReader entree;
    
    private static EmployeHoraire eh;
    private static EmployeCommercial ec;
    
    private static StringTokenizer token;
    private static String ligne;
    private static String mot;
    private static int matricule;
    private static String nom;
    
    private static  ArrayList<Employe> listeEmp = new ArrayList<Employe>();
   
    public static ArrayList lireEmploye(String emp)throws IOException
    {
      dossier = new File("U:\\JAVA\\Fichiers");
      fichierEntree = new File(dossier, emp);
      
        try
        {
            entree = new BufferedReader(new InputStreamReader(new FileInputStream(fichierEntree),"Cp1252"));
            
            try
            {
                
                    ligne = entree.readLine();
                    
                    
                    while (ligne != null)
                    {
                        
                        token = new StringTokenizer(ligne, ";");
                        
                        mot = token.nextToken();
                        matricule = Integer.parseInt(mot);  
                        nom = token.nextToken();
                        mot = token.nextToken();
                        
                        
                        if (mot.equals("h"))
                        {
                           eh = new EmployeHoraire(matricule, nom);                       

                            mot = token.nextToken();
                            eh.setHeure(Double.parseDouble(mot));
                            
                            mot = token.nextToken();
                            eh.setSalaire(Double.parseDouble(mot));
                            
                            mot = token.nextToken();
                            eh.setHeureSupp(Double.parseDouble(mot));
                            
                            listeEmp.add(eh);
                        }
                        else
                        {
                            ec = new EmployeCommercial(matricule, nom);

                            mot = token.nextToken();
                            ec.setSalaireFixe(Double.parseDouble(mot));
                            
                            mot = token.nextToken();
                            ec.setChiffreAffaire(Double.parseDouble(mot));
                            
                            listeEmp.add(ec);
                        }
                        
                        ligne = entree.readLine();
                                             
                }
            } finally
            {

                entree.close();
            }
        } catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
      return listeEmp;
    }
    
    
}
