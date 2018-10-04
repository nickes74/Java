import utilitairesMG.divers.Clavier;

public class ClavierInt
{
    private static int nombre;
     
    public static int readInt (int min, int max) throws BorneException
    {       
        System.out.println("Saisir un entier :");
        nombre = Clavier.readInt();
            
        if (nombre < min || nombre >max)
        {
            throw new BorneException(min, max, nombre);
        }
        return nombre;
    }
}
