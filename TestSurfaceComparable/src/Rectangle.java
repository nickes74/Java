
public class Rectangle extends Figure
{
    private int largeur;
    private int hauteur;
    
    public Rectangle(int largeur, int hauteur)
    {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    @Override
  public Double getSurf()
    {
        return ((double)largeur * hauteur);
    }
  
    @Override
  public String toString()
    {
        return "Rectangle de largeur : " + largeur + ", de hauteur : " + hauteur + ", Surface : "+ getSurf();
    }
}
