import java.util.Vector;
import utilitairesMG.divers.*;


public class ExoTabVoiture
{

   
    public static void main(String[] args)
    {
        Vector<Garage> garage =  new Vector<Garage>();       
        Vector<Vendeur> vendeur = new Vector();
        Vector<Voiture> voiture = new Vector();
        
        int  numMoteur;
        String nomVendeur;
        
        int nbVoitures;
        int nom = Integer.MAX_VALUE;
        
        
        
        garage.add(new Garage("Avenue des Champs Elysees 75008 PARIS"));
        garage.add(new Garage());
            
        vendeur.add(new Vendeur("Oie", "BERNACHE", garage.get(0)));
        vendeur.add(new Vendeur("Aigle", "ROYAL", garage.get(1)));
        vendeur.add(new Vendeur("Balbuzard", "PECHEUR", garage.get(0)));
        
        
        System.out.println("\nEntrez le nombre de voitures à créer : ");
        nbVoitures = Clavier.readInt();
              
        for (int i = 0; i < nbVoitures; i++)
        {
            System.out.print("\nVoiture " + (i+1) + ": ");
            
            System.out.print("\nNumero de moteur (ou 0) : ");
            numMoteur = Clavier.readInt();
            
            
            System.out.print("Nom du vendeur : ");
            nomVendeur = Clavier.readString();
            
            for (int j = 0; j < vendeur.size(); j++)
            {
                if (vendeur.get(j).getNomVendeur().compareToIgnoreCase(nomVendeur) == 0)
                {
                    nom = j;
                }
            }
                       
                if (nom < vendeur.size() && numMoteur !=0)
                {
                    voiture.add(new Voiture(numMoteur, vendeur.get(nom)));
                }
                if (nom < vendeur.size() && numMoteur ==0)
                {
                    voiture.add(new Voiture(vendeur.get(nom)));
                }
                if (nom >= vendeur.size() && numMoteur !=0)
                {
                    voiture.add(new Voiture(numMoteur));
                }
                if (nom >= vendeur.size() && numMoteur == 0)
                {
                    voiture.add(new Voiture());
                }               
            nom = vendeur.size() + 1;
        }
        
        for (int i = 0; i < nbVoitures; i++)
        {
            System.out.println(voiture.get(i));  
        }
            
    }
    
}
