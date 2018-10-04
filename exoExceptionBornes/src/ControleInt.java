
public class ControleInt
{
    private static int nombre;
    private static boolean test;
    
    public static int saisieInt (int min, int max) throws BorneException
    {
       do{   
        try
        {
            nombre = ClavierInt.readInt(min, max);  
            test = false;
        } 
        catch (NumberFormatException e)
        {
            System.out.println("Saisie Incorrect\n");
            test = true;
        }
        catch (BorneException e)
        {
            System.out.println(e.getMessage());
            test = true;
        }
       }while (test);
       
       return nombre;
    }
}
