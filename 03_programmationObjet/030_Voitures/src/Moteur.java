// ==========================================================================
// Classe Moteur :  
// ==========================================================================

public class Moteur
{
// --------------------------------------------------------------------------
// Proprietes :
// --------------------------------------------------------------------------
// kMoteur : num�ro de moteur � attribuer � tout nouveau moteur (compteur).
// numMoteur : num�ro du moteur de l'objet courant.
// --------------------------------------------------------------------------
    private static int kMoteur = 1000;
    private String numMoteur;

// --------------------------------------------------------------------------
// Constructeurs :
// --------------------------------------------------------------------------
// Constructeur sans param�tre : utilise kMoteur pour initialiser le num�ro
// de moteur numMoteur.
// --------------------------------------------------------------------------
    public Moteur()
    {
        kMoteur++;
        numMoteur = "NMOT" + kMoteur;
    }

// --------------------------------------------------------------------------
// Constructeur avec param�tre : utilise une variable num de type entier 
// pour initialiser numMoteur.
// --------------------------------------------------------------------------
    public Moteur(int num)
    {
        numMoteur = "NMOT" + num;
    }

// --------------------------------------------------------------------------
// Methode toString
// --------------------------------------------------------------------------
    public String toString()
    {
        return numMoteur;
    }
}
