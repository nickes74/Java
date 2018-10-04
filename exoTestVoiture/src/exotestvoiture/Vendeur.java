
package exotestvoiture;


public class Vendeur
{
    private String nom;
    private String prenom;
    private Garage g;
    
    
    public Vendeur (String prenom, String nom, Garage g)
    {
        this.prenom = prenom;
        this.nom = nom;
        this.g = g;        
    }
    public String toString ()
    {
            return "\n" + prenom + " " + nom + "\n" + g;       
    }
}
