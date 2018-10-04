
public class Cercle extends Figure
{
    private int rayon;    
   
    
    public Cercle (int rayon)
    {
        this.rayon = rayon;
    }
    
    @Override
    public Double getSurf()
    {
        return (rayon * rayon) * Math.PI;                   /* pas besoin de cast car Math.PI est déjà un double */
    }
    
    @Override
    public String toString()
    {
        return "Cercle de rayon : " + rayon + ", Surface : "+ getSurf();
    }
}
