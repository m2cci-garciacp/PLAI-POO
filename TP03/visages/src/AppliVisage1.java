import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Animation d'un visage dans une fenêtre graphique.
 * Un visage est dessiné à l'intérieur d'une fenêtre et se déplace. Chaque fois
 * que l'un des bords est atteint, le visage change de direction.
 * 
 * @author Philippe Genoud
 * @version 1
 */

public class AppliVisage1 {

    public static void main(String[] args) {

        // la fenêtre graphique
        JFrame laFenetre = new JFrame("VISAGE ANIME");
        laFenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        laFenetre.setSize(512, 512);

        // créé la zone de dessin et la place dans la fenêtre
        Dessin d = new Dessin();
        laFenetre.add(d);

        // affiche la fenêtre
        laFenetre.setVisible(true);

        // creation d'un objet VisageRond
        VisageRond v1 = new VisageExpressif(0);
        VisageRond v2 = new VisageExpressif(d.getWidth() / 2, d.getWidth() / 2, 30, 40, 1);
        v2.setDy(-v2.getDy());

        // on rajoute cet objet la zône de dessin
        d.ajouterObjet(v1);
        d.ajouterObjet(v2);

        // la boucle d'animation
        // c'est une boucle infinie, le programme devra être interrompu
        // par CTRL-C ou en cliquant dans la case de fermeture de la fenêtre
        while (true) {
            // le visage a atteint un des bords, il change de direction
            if (v1.bordHautAtteint())
                v1.inverserDy();
            else if (v1.bordBasAtteint())
                v1.inverserDy();
            else if (v1.bordDroitAtteint())
                v1.inverserDx();
            else if (v1.bordGaucheAtteint())
                v1.inverserDx();

            if (v2.bordHautAtteint())
                v2.inverserDy();
            else if (v2.bordBasAtteint())
                v2.inverserDy();
            else if (v2.bordDroitAtteint())
                v2.inverserDx();
            else if (v2.bordGaucheAtteint())
                v2.inverserDx();

            // le visage effectue un déplacement élémentaire
            v1.deplacer();
            v2.deplacer();

            // la zone de dessin se réaffiche
            d.repaint(50);

            // un temps de pause pour avoir le temps de voir le nouveau dessin
            d.pause(30);

        }
    }

} // AppliVisage1
