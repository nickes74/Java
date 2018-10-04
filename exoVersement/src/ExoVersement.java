
import java.io.*;
import java.text.*;
import java.util.*;
import utilitairesMG.divers.*;

public class ExoVersement 
{

    public static void main(String[] args)throws IOException, ParseException
    {
        File dossier;
        File fichierEntree;
        File fichierSortie;
        
        BufferedReader entree;
        Fichier sortie;
        
  
        File fichierEntree2;
        FichierVersementBinaire entree2;
        
        Date date;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        Vector<Versement> liste = new Vector<Versement>();
        Versement versement;
        Versement versement2;
        
        StringTokenizer token;
        int n;
        String mot;
        String ligne;        
        double d;
        
        dossier = new File("U:\\JAVA\\Fichiers");
        fichierEntree = new File(dossier,"versements.txt");
        fichierSortie = new File(dossier,"versementTries.dat");
        
        try
        {
            entree = new BufferedReader(new InputStreamReader(new FileInputStream(fichierEntree),"Cp1252"));
            try
            {
                sortie = new Fichier(fichierSortie, "rw", 27);
                
                try
                {
                    ligne = entree.readLine();
                    while(ligne != null)
                    {
                        versement = new Versement();
                        
                        token = new StringTokenizer(ligne, ";");
                        
                        mot = token.nextToken();
                        n = Integer.parseInt(mot);
                        versement.setNumero(n);
                                             
                        mot = token.nextToken();
                        date = formatter.parse(mot);
                        versement.setDate(date);
                        
                        mot = token.nextToken();
                        d = Double.parseDouble(mot);
                        versement.setMontant(d); 
                    
                        mot = token.nextToken();
                        n = Integer.parseInt(mot);
                        versement.setNumContact(n);
                        
                        liste.add(versement);
                        ligne = entree.readLine();
                    }
                    
                    Collections.sort(liste);
                    
                    for (int i = 0; i < liste.size(); i++)
                    {
                        //System.out.println(liste.get(i));
                        sortie.writeInt(liste.get(i).getNumero());
                        mot = formatter.format(liste.get(i).getDate());
                        sortie.writeString(mot,11);
                        sortie.writeDouble(liste.get(i).getMontant());
                        sortie.writeInt(liste.get(i).getNumContact());
                    }
                    
                    
                    fichierEntree2 = new File (dossier, "versementTries.dat");
                    entree2 = new FichierVersementBinaire(fichierEntree2, "r", 27);
                    
                    Vector<Versement> liste2 = new Vector<Versement>();
                    
                    versement2 = new Versement();
                    
                    do
                    {
                        entree2.defVersement(versement2);
                        System.out.println(versement2);
                        liste2.add(versement2);
                    } while (true);   
                    
                    
                } catch (IOException e)
                {
                    System.out.println(e.getMessage());
                }
                catch (NumberFormatException e)
                {
                    System.out.println(e.getMessage());
                }
                catch ( ParseException e)
                {
                    date = null;
                    System.out.println(e.getMessage());
                }
                finally
                {
                    sortie.close();
                }
            } catch (Exception e)
            {
            }
            finally
                {
                    entree.close();
                }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
    }


}
