import java.util.*;
import java.text.*;
import utilitairesMG.divers.Clavier;

public class TestDateFr
{
    public static void main(String[] args) throws ParseException
    {
        DateFr date1, date2;
        String saisieDate;
        
// ----------------------------------------------------------------------------
// Instanciation des 2 objets DateFr
// ---------------------------------------------------------------------------- 
               
        date1 = new DateFr();
        date2 = new DateFr("19/06/2018");
        System.out.println("date 1 : " + date1 + " date 2 : " + date2);
        
// ---------------------------------------------------------------------------- 
// Utilisation des méthodes set et add
// ---------------------------------------------------------------------------- 
        
        date1.set("31/01/2017");
        System.out.println("\ndate 1 apres set : " + date1);
        
        date1.add(Calendar.MONTH, 3);
        System.out.println("\ndate 1 apres add : " + date1);
        
// ---------------------------------------------------------------------------- 
// Changement de format
// ---------------------------------------------------------------------------- 
        
        date1.setFormat("EEEE dd MMMM yyyy");
        System.out.println("\ndate 1 apres setFormat : " + date1);
        
// ---------------------------------------------------------------------------- 
// Changement de format et saisie au clavier d'une nouvelle date
// ---------------------------------------------------------------------------- 
        
        date1.setFormat("dd MMMM yyyy");
        System.out.println("\nsaisir une date (" + date1.toFormat() + ") : ");
        saisieDate = Clavier.readString();
        date1.set(saisieDate);
        System.out.println("date 1 apres set : " + date1);
        
// ---------------------------------------------------------------------------- 
// Calcul de la différence des 2 dates
// ---------------------------------------------------------------------------- 
        
        System.out.println("\ndate1 : " + date1 +" date2 : " + date2);
        System.out.println("Difference : " + DateFr.difDates(date1, date2) + " jour(s)");
    }
    
}
