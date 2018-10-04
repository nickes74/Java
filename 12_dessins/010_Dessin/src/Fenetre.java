import javax.swing.*;
import java.awt.*;
import utilitairesMG.graphique.*;

public class Fenetre extends JFrame
{
    private JPanel panneauFond;
    private JScrollPane defileur;

    private Panneau panneau1;
    private Panneau panneau2;

    public Fenetre(String s)
    {
        super(s);
        addWindowListener(new EcouteFenetre());

// ---------------------------------------------------------------------
// Creation de l'objet panneauFond :
// ---------------------------------------------------------------------
        panneauFond = new JPanel();
        panneauFond.setLayout(new FlowLayoutMG());
        panneauFond.setBackground(new Color(150, 150, 150));

// ---------------------------------------------------------------------
// Creation des objets Panneau :
// ---------------------------------------------------------------------
        panneau1 = new Panneau();
        panneau1.setBackground(Color.white);
        panneau1.setForeground(Color.black);
        panneau1.setPreferredSize(new Dimension(250, 250));

        panneau2 = new Panneau();
        panneau2.setBackground(Color.black);
        panneau2.setForeground(Color.white);
        panneau2.setPreferredSize(new Dimension(250, 250));

        panneauFond.add(panneau1);
        panneauFond.add(panneau2);

        defileur = new JScrollPane(panneauFond);

        getContentPane().add(defileur);

        pack();
        setVisible(true);
    }
}
