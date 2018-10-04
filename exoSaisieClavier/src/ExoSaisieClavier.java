
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExoSaisieClavier
{

    public static void main(String[] args) throws Exception
    {
        int i;
        String chaine;
        double doub;
        
        System.out.println("Saisir un entier : ");
        i = Clavier.readInt();
        System.out.println("Vous avez tapé l'entier : " + i );
        System.out.println(i + "+" + i + "=" + (i+i)+ "\n");
        
        System.out.println("Saisir un double : ");
        doub = Clavier.readDouble();
        System.out.println("Vous avez tapé le double : " + doub + "\n");
        System.out.println(doub + "+" + doub + "=" + (doub+doub)+ "\n");
        
        System.out.println("Saisir une chaine : ");
        chaine = Clavier.readString();
        System.out.println("Vous avez tapé la chaine : " + chaine + "\n");
        
    }
    
}
