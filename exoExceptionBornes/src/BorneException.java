
public class BorneException extends Exception
{

    public BorneException(int min, int max, int nombre)
    {
       super("Valeur " + nombre + " hors de [" 
                + min + ", " + max + "]\n");
    }
    
}
