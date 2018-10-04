
        
package exoexceptiontab;

import java.io.IOException;


public class ExoExceptionTab 
{

   
    public static void main(String[] args) throws Exception
    {
        String tabString[];
        tabString = new String[3];
        int i;
        
        tabString[0] = "Autruche";
        tabString[1] = "Bruant";
        tabString[2] = "Corbeau";
        

//        try
//        {
            for (i = 0; i < 4; i++)
            {
                if (i == 3)
                {
                    throw new IOException();           
                }
                System.out.println("tab(" + i + ") : " + tabString[i]);
            }         
            
//        }      
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(" *** L'INDEXE DE LA BOUCLE EST TROP GRAND ***");
//        }
//        
        
    }
    
}
