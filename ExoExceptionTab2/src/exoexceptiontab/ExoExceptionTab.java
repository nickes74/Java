
package exoexceptiontab;


public class ExoExceptionTab
{

   
    public static void main(String[] args)
    {
        int tabInt[];
        tabInt = new int[3];
        
        tabInt[0] = 8;
        tabInt[1] = 3;
        tabInt[2] = 4;
        
        try
        {
            for (int i = 0; i <= 3; i++)
            {
            System.out.println("tab de (" + i + ") : " + tabInt[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("*** L'INDEXE DE LA BOUCLE EST TROP GRAND ***");
        }
        
        
    }
    
}
