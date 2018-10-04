
public class Contact
{
    private Integer numero;
    private String nom;
    private String adresse;
    private String codePostal;
    private String ville;
    private Integer codeSecteur;
    
    public void setNumero(Integer numero)
    {
        this.numero = numero;
    }
    
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }
    
    public void setCodePostal(String codePostal)
    {
        this.codePostal = codePostal;
    }
     
    public void setVille(String ville)
    {
        this.ville = ville;
    }
    
    public void setCodeSecteur(Integer codeSecteur)
    {
        this.codeSecteur = codeSecteur;
    }
    
    public Integer getNumero()
    {
        return numero;
    }
    
    public String getNom()
    {
        return nom;
    }
    
    public String getAdresse()
    {
        return adresse;
    }
    
    public String getCodePostal()
    {
        return codePostal;
    }
    
    public String getVille()
    {
        return ville;
    }
    
    public Integer getCodeSecteur()
    {
        return codeSecteur;
    }
    
    public String toString()
    {
        return numero + ";" + nom + ";" + adresse + ";" + codePostal + ";" + ville + ";" + codeSecteur;
    }
    
}
