
public class EmployeCommercial extends Employe
{
    private Double salaireFixe;
    private Double chiffreAffaire;

    
    
    public EmployeCommercial(int matricule, String nom)
    {
       super(matricule, nom);
    }

    
    public void setSalaireFixe(Double salaireFixe)
    {
        this.salaireFixe = salaireFixe;
    }
    
    public void setChiffreAffaire(Double chiffreAffaire)
    {
        this.chiffreAffaire = chiffreAffaire;
    }
    
    public Double calculeSalaire()
    {
        return (salaireFixe+(0.15*chiffreAffaire));
    }
    
        public String toString()
    {
        return "Employe commercial matricule : " + super.toString();
    }
}
