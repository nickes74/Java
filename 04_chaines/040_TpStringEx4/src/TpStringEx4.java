// ==========================================================================
// Ecrire la cha�ne en invers� (ex . ABC --> CBA ) . 
// ==========================================================================

public class TpStringEx4
{
    public static void main(String arg[])
    {
        String chaine; 

        chaine = "J'utilise JAVA avec brio !";
        System.out.println("AU DEPART : " + chaine);

// --------------------------------------------------------------------------
// Affichage de la chaine a l'envers
// --------------------------------------------------------------------------
        System.out.println("A LA FIN  : " + new StringBuffer(chaine).reverse());
    }
}
