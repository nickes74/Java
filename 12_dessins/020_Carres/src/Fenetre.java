import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import utilitairesMG.graphique.*;

public class Fenetre extends JFrame implements ActionListener
{
    private PanneauDessin panneauFond;

    private JMenuBar barreMenu;

    private JMenu menuJeu;
    private JMenuItem effacerItem;
    private JMenuItem aideItem;

    private JMenu menuCouleur;
    private JCheckBox rougeItem;
    private JCheckBox vertItem;
    private JCheckBox bleuItem;

    public Fenetre(String s)
    {
        super(s);
        addWindowListener(new EcouteFenetre());

// --------------------------------------------------------------------------
// Creation de l'objet panneauFond :
// --------------------------------------------------------------------------
        panneauFond = new PanneauDessin();
        add(panneauFond);

// --------------------------------------------------------------------------
// Creation de la barre de menu :
// --------------------------------------------------------------------------
        barreMenu = new JMenuBar();

        menuJeu = new JMenu("Jeu");
        menuJeu.setMnemonic('J');
        effacerItem = new JMenuItem("Effacer", 'E');
        aideItem = new JMenuItem("Aide", 'A');

        effacerItem.addActionListener(this);
        aideItem.addActionListener(this);

        menuJeu.add(effacerItem);
        menuJeu.add(aideItem);
        barreMenu.add(menuJeu);

        menuCouleur = new JMenu("Couleur");
        menuCouleur.setMnemonic('C');
        rougeItem = new JCheckBox("Rouge");
        vertItem = new JCheckBox("Vert");
        bleuItem = new JCheckBox("Bleu");

        rougeItem.addActionListener(this);
        vertItem.addActionListener(this);
        bleuItem.addActionListener(this);

        menuCouleur.add(rougeItem);
        menuCouleur.add(vertItem);
        menuCouleur.add(bleuItem);
        barreMenu.add(menuCouleur);

        setJMenuBar(barreMenu);

        pack();
        setVisible(true);
    }

// --------------------------------------------------------------------------
// Méthode de l'interface ActionListener
// --------------------------------------------------------------------------
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        int r, v, b;

        if (source == effacerItem)
        {
            panneauFond.videPanneau();
        }
        else 
        {
            if (source == aideItem)
            {
                JOptionPane.showMessageDialog(this,
                    "Clic gauche : ajout et déplacement\n"
                    + "Clic droit : suppression\n"
                    + "Roulette : dimension carré",
                    "Fonctionnement du jeu",
                    JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon("terre.gif"));
            }
            else
            {
                r = 0;
                v = 0;
                b = 0;
                if (rougeItem.isSelected())
                {
                    r = 255;
                }
                if (vertItem.isSelected())
                {
                    v = 255;
                }
                if (bleuItem.isSelected())
                {
                    b = 255;
                }
                panneauFond.setCouleurCourante(new Color(r, v, b));
            }
        }
    }
}
