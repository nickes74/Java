public class CarresPanneaux
{
    public static void main(String args[])
    {
        javax.swing.SwingUtilities.invokeLater
        (
            new Runnable() 
            {
                public void run() 
                {
                    Fenetre fenetre = 
                        new Fenetre("Les p'tits carrés (panneaux)");
                }
            }
        );
    }
}