
import java.util.StringTokenizer;


public class Contact implements Comparable<Contact>
{
    private Integer numero;
    private String nom;
    private String adresse;
    private String codePostal;
    private String ville;
    private Integer codeSecteur;
    
    Contact contact;
    
    StringTokenizer token;

    
    public Contact(String ligne)
    {
        token = new StringTokenizer(ligne, ";");
        this.numero = Integer.parseInt(token.nextToken());
        this.nom = token.nextToken();
        this.adresse = token.nextToken();
        this.codePostal = token.nextToken();
        this.ville = token.nextToken();
        this.codeSecteur = Integer.parseInt(token.nextToken());      
    }
    
    @Override
    public int compareTo(Contact contact)
    {
	return numero.compareTo(contact.numero);
    }
    
    @Override
    public String toString()
    {
        return numero + ";" +  nom + ";" + adresse + ";" + codePostal + ";" + ville + ";" + codeSecteur;       
    }
}
