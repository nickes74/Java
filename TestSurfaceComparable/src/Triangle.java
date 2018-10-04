
public class Triangle extends Figure
{
    private int base;
    private int hauteur;
    
    
    public Triangle (int base, int hauteur)
    {
        this.base = base;
        this.hauteur = hauteur;
    }
    
    @Override
    public Double getSurf()
    {
        return ((double)base * hauteur) / 2;                    /* on aurait pu utiliser aussi 2.0 qui est un double et aurait caster toute la ligne */
    }
    
    @Override
    public String toString()
    {
        return "Triangle de base : " + base + ", de hauteur : " + hauteur + ", Surface : "+ getSurf();
    }
}
