// ==========================================================================
// Classe Voiture :  
// ==========================================================================

public class Voiture
{
// --------------------------------------------------------------------------
// Proprietes :
// --------------------------------------------------------------------------
// kVoiture : compteur du nombre de voitures instanciees.
// numVoiture : num�ro de voiture de l'objet courant.
// vendeurVoiture : vendeur de la voiture.
// moteurVoiture : moteur de la voiture.
// --------------------------------------------------------------------------
    private static int kVoiture = 0;

    private int numVoiture;
    private Vendeur vendeurVoiture;
    private Moteur moteurVoiture;

// --------------------------------------------------------------------------
// Constructeurs : utilisent kVoiture pour initialiser numVoiture.
// --------------------------------------------------------------------------
// Constructeur sans param�tre.
// --------------------------------------------------------------------------
    public Voiture()
    {
        kVoiture++;
        numVoiture = kVoiture;
        moteurVoiture = new Moteur();
    }

// --------------------------------------------------------------------------
// Constructeur avec param�tre : idem que le pr�c�dent mais ce constructeur
// utilise une variable num de type entier pour initialiser le num�ro de 
// moteur de la voiture.
// --------------------------------------------------------------------------
    public Voiture(int num)
    {
        kVoiture++;
        numVoiture = kVoiture;
        moteurVoiture = new Moteur(num);
    }

// --------------------------------------------------------------------------
// Constructeur avec param�tre : idem que le premier mais ce constructeur
// utilise une variable vendeurVoiture de type Vendeur pour initialiser le
// nom du vendeur de la voiture.
// --------------------------------------------------------------------------
    public Voiture(Vendeur vendeurVoiture)
    {
        kVoiture++;
        numVoiture = kVoiture;
        moteurVoiture = new Moteur();
        this.vendeurVoiture = vendeurVoiture;
    }

// --------------------------------------------------------------------------
// Constructeur avec param�tres : combinaison des deux constructeurs
// pr�c�dents.
// --------------------------------------------------------------------------
    public Voiture(int num, Vendeur vendeurVoiture)
    {
        kVoiture++;
        numVoiture = kVoiture;
        moteurVoiture = new Moteur(num);
        this.vendeurVoiture = vendeurVoiture;
    }

// --------------------------------------------------------------------------
// Surcharge de la methode toString de la classe Object
// --------------------------------------------------------------------------
// Cette m�thode est ex�cut�e lors de l'appel "System.out.println(v1)".
// Quand la methode println s'ex�cute, elle cherche une m�thode toString 
// correspondant � l'objet. Si elle ne la trouve pas, elle ex�cute celle de
// la classe Object, qui affichera l'adresse m�moire de v1...
// --------------------------------------------------------------------------
    public String toString()
    {
        if (vendeurVoiture != null)
        {
            return "\nVOITURE   : " + numVoiture
                + "\nMOTEUR    : " + moteurVoiture
                + "\nVENDEUR   : " + vendeurVoiture;
        }
        else
        {
            return "\nVOITURE   : " + numVoiture
                + "\nMOTEUR    : " + moteurVoiture
                + "\nVENDEUR INCONNU";
        }
    }
}
