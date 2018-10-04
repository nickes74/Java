// ========================================================================
// APPLICATION TestStringTokenizer :
// ========================================================================

import java.util.*;
import java.io.*;

public class TestStringTokenizer
{
    public static void main(String[] args) throws IOException
    {
        String ligne;
        StringTokenizer token;
        int nombreUnites;

        ligne = "Je suis;une hirondelle;de chemin�e";
        token = new StringTokenizer(ligne, ";");

        nombreUnites = token.countTokens();
        System.out.print("La chaine : \"" + ligne + "\"");
        System.out.println(" a " + nombreUnites + " unit�s s�par�es par des ;");

        System.out.println("\nCes unit�s sont :");
        
        while (token.hasMoreTokens())
        {
            System.out.println(token.nextToken());
        }
    }
}
