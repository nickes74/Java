
public abstract class Employe
{
   private Integer matricule;
   private String nom;
   private char type;
    
    
   public Employe(int matricule, String nom)
   {
      this.matricule = matricule;
      this.nom = nom;
    }
    
    
    
    public abstract Double calculeSalaire();
    
    public String toString()
    {
            return matricule + ", nom : " + nom;   
    }

    public void setMatricule(int matricule)
    {
        this.matricule = matricule;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
}
