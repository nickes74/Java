
package exoexceptiontab;


public class ExoExceptionTab
{

   
    public static void main(String[] args)
    {
        int tabInt[];
        tabInt = new int[2];
        
        tabInt[0] = 8;
        tabInt[1] = 3;
        tabInt[2] = 4;
        
        for (int i = 0; i <=3;i++)
        {
            System.out.println("tab de (" + i + ") : " + tabInt[i]);
        }
    }
    
}
