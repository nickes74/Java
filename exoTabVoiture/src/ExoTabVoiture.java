import utilitairesMG.divers.*;


public class ExoTabVoiture
{

   
    public static void main(String[] args)
    {
        Garage g1, g2;
        
        Vendeur  tabVendeur[];
        Voiture tabVoiture[];
        
        int  numMoteur;
        String nomVendeur;
        
        int nbVoitures = 0;
        int nom = Integer.MAX_VALUE;
        
        
        
        g1 = new Garage("Avenue des Champs Elysees 75008 PARIS");
        g2 = new Garage();
        
        
        tabVendeur = new Vendeur[3];    
        tabVendeur[0] = new Vendeur("Oie", "BERNACHE", g1);
        tabVendeur[1] = new Vendeur("Aigle", "ROYAL", g2);
        tabVendeur[2] = new Vendeur("Balbuzard", "PECHEUR", g1);
        
        
        System.out.println("\nEntrez le nombre de voitures à créer : ");
        nbVoitures = Clavier.readInt();

        tabVoiture = new Voiture[nbVoitures];
              
        for (int i = 0; i < nbVoitures; i++)
        {
            System.out.print("\nVoiture " + (i+1) + ": ");
            
            System.out.print("\nNumero de moteur (ou 0) : ");
            numMoteur = Clavier.readInt();
            
            
            System.out.print("Nom du vendeur : ");
            nomVendeur = Clavier.readString();
            
            for (int j = 0; j < tabVendeur.length; j++)
            {
                if (tabVendeur[j].getNomVendeur().compareToIgnoreCase(nomVendeur) == 0)
                {
                    nom = j;
                }
            }
                       
                if (nom < tabVendeur.length && numMoteur !=0)
                {
                    tabVoiture[i] = new Voiture(numMoteur, tabVendeur[nom]);
                }
                if (nom < tabVendeur.length && numMoteur ==0)
                {
                    tabVoiture[i] = new Voiture(tabVendeur[nom]);
                }
                if (nom >= tabVendeur.length && numMoteur !=0)
                {
                    tabVoiture[i] = new Voiture(numMoteur);
                }
                if (nom >= tabVendeur.length && numMoteur == 0)
                {
                    tabVoiture[i] = new Voiture();
                }               
            nom = tabVendeur.length + 1;
        }
        
        for (int i = 0; i < nbVoitures; i++)
        {
            System.out.println(tabVoiture[i]);  
        }
            
    }
    
}
