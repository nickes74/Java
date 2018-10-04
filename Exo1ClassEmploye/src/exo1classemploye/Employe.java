public class Employe
{
    private int matricule;
    private String  nom;
    
    public void afficheEmploye()
    {
        System.out.println("nom        :"+nom);
        System.out.println("Matricule  :"+matricule);
    }
    
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    public void setMatricule(int matricule)
    {
        this.matricule = matricule;
    }
}