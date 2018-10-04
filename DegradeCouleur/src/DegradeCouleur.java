import java.awt.*;
		
		
/**

 
 Rectangle dégradé de couleur
 
 Choix des couleurs en :
 
           RVB
 
           Hexa
 
           Decimal
 
           Composante
 
 */

public class Shade extends Canvas{

	final int LARGEUR = 600;
	int x;
	int y;
	int hauteur;
	int red1;
	int red2;
	int green1;
	int green2;
	int blue1;
	int blue2;

	/**

	 
 Crée un dégradé de noir sur blanc
	 
/

	public Shade(){
		red1   = 0;
		green1 = 0;
		blue1  = 0;
		red2   = 255;
		green2 = 255;
		blue2  = 255;
	}
	
	/**

	 
 Crée un dégradé avec les valeurs hexadécimales des couleurs
	 
 @param hexa1 valeur hexa premiere couleur
	 
 @param hexa2 valeur hexa deuxieme couleur
	 
/

	public Shade(String hexa1,String hexa2){
		red1   = Integer.parseInt(hexa1.substring(0, 2), 16);
		green1 = Integer.parseInt(hexa1.substring(2, 4), 16);
		blue1  = Integer.parseInt(hexa1.substring(4, 6), 16);
		red2   = Integer.parseInt(hexa2.substring(0, 2), 16);
		green2 = Integer.parseInt(hexa2.substring(2, 4), 16);
		blue2  = Integer.parseInt(hexa2.substring(4, 6), 16);
	}
	
	/**

	 
 Dégradé avec les composantes décimales des couleurs
	 
 @param r1 Composante rouge de la premiere couleur
	 
 @param v1 Composante verte de la premiere couleur
	 
 @param b1 Composante bleu de la premiere couleur
	 
 @param r2 Composante rouge de la deuxieme couleur
	 
 @param v2 Composante verte de la deuxieme couleur
	 
 @param b2 Composante bleu de la deuxieme couleur
	 
/

	public Shade(int r1,int v1,int b1,int r2,int v2,int b2){
		red1   = r1;
		green1 = v1;
		blue1  = b1;
		red2   = r2;
		green2 = v2;
		blue2  = b2;
	}
	
	/**

	 
 Dégradé vers le blanc avec composantes Décimales
	 
 @param r Composante rouge
	 
 @param v Composante verte
	 
 @param b Composante bleu
	 
/

	public Shade(int r,int v, int b){
		red1   = r;
		green1 = v;
		blue1  = b;
		red2   = 0;
		green2 = 0;
		blue2  = 0;
	}
	
	/**

	 
 Obtenir un dégradé depuis deux couleurs de la classe Color
	 
 @param c1 Couleur 1
	 
 @param c2 Couleur 2
	 
/

	public Shade(Color c1,Color c2){
		red1   = c1.getRed();
		green1 = c1.getGreen();
		blue1  = c1.getBlue();
		red2   = c2.getRed();
		green2 = c2.getGreen();
		blue2  = c2.getBlue();
	}
	

	public void paint(Graphics g) {
		int i;
		for(i=0; i<LARGEUR; i++) {
			g.setColor(new Color((red1*(LARGEUR-i)+red2*i)/LARGEUR,(green1*(LARGEUR-i)+green2*i)/LARGEUR,(blue1*(LARGEUR-i)+blue2*i)/LARGEUR));
			g.drawLine(x+i,y,x+i,y+hauteur);
		}
	}
}
