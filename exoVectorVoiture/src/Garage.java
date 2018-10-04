


public class Garage
{
   private String adresse;
   private static String marque = "VOLIERE SA";
    
    public Garage(String adresse)
    {
        this.adresse = adresse;
    }
    
       public Garage()
    {
        adresse = "Rue Paradis 13001 PARIS";
    }
       
    static String getNomMarque()
    {
        return marque;
    }
    
   @Override
    public String toString()
    {
        return marque + " - " + adresse;
    }
    
}
