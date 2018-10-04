
package exoremplacemot;


public class ExoRemplaceMot 
{

   
    public static void main(String[] args)
    {
        String str = "J'utilise JAVA avec brio";
        String str2;
        
        System.out.println("Avant : " + str);
        
        str2 = str.replaceAll ("JAVA","C++");
        
        System.out.println("\n Après : " + str2);
        
    }
    
}
