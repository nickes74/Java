
import animationMG.DessinAbstract;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

public class Dessin extends DessinAbstract       
{

    @Override
    public Shape getDessin()
    {
//        Arc2D camembert;
//        
//        camembert = new Arc2D.Float(Arc2D.PIE);
//        camembert.setFrame(0, 0, 100, 100);
//        camembert.setAngleStart(30);
//        camembert.setAngleExtent(300);
//        
//        return camembert;
        
//        Ellipse2D ellipse;
//        
//        ellipse = new Ellipse2D.Float(0,0,150,100);
//        
//        return ellipse;
        
        int[] x={0,20,70,90,90,70,80,50,40,10,20,0};
        int[] y={20,0,0,20,70,90,150,90,90,150,90,70};   
        Polygon p = new Polygon(x, y,x.length );
        
        return p;
    }

   
    public Color getCouleur()
    {
        Color color = new Color(255,250,254);
        return color;
    }
    
    public int getTransparence()
    {
        return 255;
    }

    
}
