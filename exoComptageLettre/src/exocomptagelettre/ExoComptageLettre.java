
package exocomptagelettre;



public class ExoComptageLettre 
{

    public static void main(String[] args) 
    {       
        String str = "J'utilise JAVA avec brio";
        String str2;
        int compteur = 0;
        
        for (int i = 0; i < str.length(); i++)   
        {
            char chartest = str.charAt(i);
            
            for (int j = 0; j < str.length(); j++)
            {
                char ch = str.charAt(j);
                
                if (ch == chartest)
                {
                   compteur++;
                }
            }
            str2 = Character.toString(chartest);
            System.out.println("lettre : " + chartest + " " + compteur + " fois");
            str = str.replace(str2,"");
            compteur = 0; 
            i = 0;
        }
    }
    
}
