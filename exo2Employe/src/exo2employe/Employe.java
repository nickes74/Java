public class Employe
{
    private String nom;
    private int matricule;
    private static int numeroAutomatique = 100;
    private static int compteur;
   
    
    public String toString()
    {
        return "nom       : " + nom + "\n" +
               "matricule : " + matricule;
    }
    
    public Employe (int matricule, String nom)
    {             
        this.nom = nom;
        this.matricule = matricule;
        compteur++;
    }
    
    public Employe (String nom)
    {      
        this.nom = nom;
        this.matricule = numeroAutomatique;
        compteur++;
        numeroAutomatique++;
    }
    
     public static int getCompteur()
    {
       return compteur;
    }
    
    public static int getNumeroAutomatique()
    {
        return numeroAutomatique;
    }
       
    public void setNom (String nom)
    {
        this.nom = nom;              
    }
    
    public String getNom()
    {
        return nom;
    }
}