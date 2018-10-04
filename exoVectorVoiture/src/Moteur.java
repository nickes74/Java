



public class Moteur 
{
    private static int  compteur = 1001;
    public int numeroMoteur;
    
    public Moteur ()
    {
        this.numeroMoteur = compteur;
        compteur++;
    }
    
    public Moteur (int annee)
    {
        this.numeroMoteur = annee;
    }
    
    @Override
    public String toString ()
    {
        return "NMOT" + numeroMoteur;
    }
}
