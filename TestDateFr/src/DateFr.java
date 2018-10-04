import java.util.*;
import java.text.*;



public class DateFr extends GregorianCalendar
{
     
    private SimpleDateFormat formatter; 
     
   public DateFr(String string) throws ParseException   /* Grace au throw pas besoin du try-catch utilisé en commentaire */
   {                                                    /* arrete le programme contrairement au try-catch */
       formatter = new SimpleDateFormat("dd/MM/yyyy");
//       try
//       {
         setTime(formatter.parse(string));
//       }
//       catch (Exception e)
//       {
//           System.out.println("pouet");
//       }
        
   }
    
    public DateFr()
    {
//      Date maDate = new Date();           /* le setTime est déjà défini de base, juste besoin d'une définition de format */
        formatter = new SimpleDateFormat("dd/MM/yyyy");
//         try 
//       {
//            super.setTime(maDate);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
      
    }

    public void set(String date)
    {
         try
       {
         super.setTime(formatter.parse(date));      /* super non obligatoire */
       }
       catch (Exception e)
       {
           System.out.println("\n*** ERREUR D'ENTREE DE DATE ***\n");
       }
    }

    public void setFormat(String format)
    {        
        formatter.applyPattern(format);
        
        //formatter = new SimpleDateFormat(format);     /* créé un nouvel objet donc un peu moins bien */
    }

    public String toFormat()
    {
        formatter = new SimpleDateFormat("dd MMMM yyyy");
        return formatter.toPattern();
    }
    
      static long difDates(DateFr date1, DateFr date2)
    {
        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis());
        return difference = (difference) / (1000 * 3600 * 24);
    }
    
    public String toString()
    {
        return formatter.format(super.getTime());       /* super inutile */
    }
}
