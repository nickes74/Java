
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.Socket;
import javax.imageio.ImageIO;
import javax.swing.*;
import utilitairesMG.graphique.EcouteFenetre;


class Fenetre extends JFrame implements ActionListener
{

    private JPanel panneauFond;
    
    private JPanel panneauNord, panneauSud;
    private JLabel titre;
    private JButton bouton;
    private JScrollPane defileur;
    private static JTextArea zoneTexte;
    private boolean test = false;
    private ServeurObjets serveur;
    private Image imgoff = ImageIO.read(getClass().getResource("green-off.gif"));
    private Image imgon = ImageIO.read(getClass().getResource("green-on.gif"));
    
    public Fenetre(String s) throws IOException
    {
        super(s);
        addWindowListener(new EcouteFenetre());
        
    //--------------------------------------------------------------------------
    //                           PANNEAU FOND
    //--------------------------------------------------------------------------
    
        panneauFond = new JPanel();
        panneauFond.setLayout(new BorderLayout());
        panneauFond.setBackground(Color.BLACK);
        panneauFond.setPreferredSize(new Dimension(400,200));
        
    //--------------------------------------------------------------------------
    //                           PANNEAU NORD avec le titre JLabel
    //--------------------------------------------------------------------------    
        
        panneauNord = new JPanel();
        panneauNord.setBackground(Color.black);
        titre = new JLabel("SERVEUR D'OBJETS");
        Font myFont = new Font("Serif", Font.BOLD, 20);
        titre.setFont(myFont);
        titre.setForeground(Color.white);
        panneauNord.add(titre);
        panneauFond.add(panneauNord, BorderLayout.NORTH);
        
    //--------------------------------------------------------------------------
    //            PANNEAU CENTRAL JTextFiels qui affiche les infos
    //--------------------------------------------------------------------------
    
        zoneTexte = new JTextArea("");
        zoneTexte.setEditable(false);
        zoneTexte.setHighlighter(null);
        
        defileur = new JScrollPane(zoneTexte);
        panneauFond.add(defileur,BorderLayout.CENTER);
        
    //--------------------------------------------------------------------------
    //                           PANNEAU SUD et bouton
    //--------------------------------------------------------------------------    
        
        panneauSud = new JPanel();
        panneauSud.setBackground(Color.black);
        panneauSud.setPreferredSize(new Dimension(400,50));
        panneauSud.setLayout(new FlowLayout(FlowLayout.RIGHT));
        bouton = new JButton("ON/OFF");
        bouton.setPreferredSize(new Dimension(120,30));
        bouton.setIcon(new ImageIcon (imgoff));
        bouton.addActionListener(this);
        panneauSud.add(bouton);
        panneauFond.add(panneauSud,BorderLayout.SOUTH);
        
        add(panneauFond);
        
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    
    
    public void afficheafficheTexte(String s)
    {
        zoneTexte.setText(s);
    }
    
    public static void afficheServeur(Socket socketClient, String requete)
    {
        zoneTexte.append("Client "
                + socketClient.getInetAddress()
                + "  : "
                + requete + "\n");
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == bouton)
        {
            
            if(!test)
            {
                ControleurServeur.demarreServeur();
                zoneTexte.append("Demarrage du serveur d'objets...\n");
                bouton.setIcon(new ImageIcon (imgon));
                test = true;
            }else
            {
                ControleurServeur.arreteServeur();
                zoneTexte.append("Le serveur a ete arrete...\n");
                bouton.setIcon(new ImageIcon (imgoff));
                test = false;
            }   
        }
        
    }
    
}
