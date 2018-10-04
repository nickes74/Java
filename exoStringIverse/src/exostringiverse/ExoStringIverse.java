
package exostringiverse;

public class ExoStringIverse
{

    public static void main(String[] args)
    {
        String str = "J'utilise JAVA avec brio";
       
        StringBuffer str2 = (new StringBuffer(str)).reverse();
        
        System.out.println(str2);
    }
    
}
