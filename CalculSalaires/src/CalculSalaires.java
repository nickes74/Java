import java.io.*;
import java.util.*;

public class CalculSalaires
{

    public static void main(String[] args) throws IOException
    {
        ArrayList<Employe> listeEmploye;
        
        listeEmploye = Fichier.lireEmploye("Employe.txt"); 
        
        System.out.println("Nombre d'employes : " + listeEmploye.size());
        
        for (int i = 0; i < listeEmploye.size(); i++)
        {
            System.out.print(listeEmploye.get(i));
            System.out.print(", salaire : " + listeEmploye.get(i).calculeSalaire() + "\n");
        }
    }
    
}
