
public class EmployeHoraire extends Employe
{
    private Double salaire;
    private Double heureSupp;
    private Double heures;
    
    public EmployeHoraire(int matricule, String nom)
   {
       super(matricule, nom);
    }
    

    public void setSalaire(Double salaire)
    {
        this.salaire = salaire;
    }
    
    public void setHeureSupp(Double heureSupp)
    {
        this.heureSupp = heureSupp;
    }
    
    public void setHeure(Double heures)
    {
        this.heures = heures;
    }
    
    
    public Double calculeSalaire()
    {
        return (heures+(2*heureSupp))*salaire;
    }
    
    public String toString()
    {
        return "Employe horaire matricule : " + super.toString();
    }
    
}
