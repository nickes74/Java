
public class ExoExceptionBornes
{

    public static void main(String[] args) throws BorneException
    {
        int i;
        i = ControleInt.saisieInt(-50, 200);
        System.out.println("Valeur saisie : " + i);
    }
    
}
