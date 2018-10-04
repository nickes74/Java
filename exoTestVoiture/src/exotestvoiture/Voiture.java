
package exotestvoiture;


public class Voiture
{
    private static int compteur = 1;
    private int numeroVoiture;
    private int annee;
    private Moteur m;
    private Vendeur vendeur;
    private Garage g;
    
    public Voiture ()
    {
        this.numeroVoiture = compteur;
        this.m = new Moteur();
        compteur++;

    }
    
    public Voiture(int annee)
    {
        this.numeroVoiture = compteur;
        this.m = new Moteur(annee);
        compteur++;
    }
    
    public Voiture (Vendeur vendeur)
    {
        this.numeroVoiture = compteur;
        this.m = new Moteur();
        this.vendeur = vendeur;
        compteur++; 
    }
    
     public Voiture (int annee, Vendeur vendeur)
    {
        this.numeroVoiture = compteur;
        this.m = new Moteur(annee);
        this.vendeur = vendeur;
        compteur++; 
    }     
     
      public Vendeur getVendeur()
     {
         return vendeur;
     }
     
     
     public String toString()
     {
         if (vendeur == null)
         {
              return "\nVOITURE   : " + numeroVoiture +
                     "\nMOTEUR    : " + m +
                     "\nVENDEUR INCONNU"; 
         }
        else
         {
              return "\nVOITURE   : " + numeroVoiture +
                     "\nMOTEUR    : " + m +
                     "\nVENDEUR   : " + vendeur;
         }
         
                 
     }
    
}
