
import java.awt.Color;
import java.awt.Graphics;

/**
 * Cette classe permet de modéliser un visage de forme ovale.
 * 
 * @author PGC
 *
 */
public class VisageExpressif extends VisageRond {

    // -------------------------------------------------------------
    // Les attributs (variables d'instance) de la classe VisageRond
    // -------------------------------------------------------------
    /**
     * expression of the visage
     */
    private int expression = 0;

    // ---------------------------------------------------------
    // Les constructeurs de la classe VisageRond
    // ---------------------------------------------------------
    /**
     * Constructeur avec valeurs par défaut. Crée un visage de taille 50x50 dont
     * le coin supérieur gauche du rectangle englobant est situé au point (0,0)
     * de la zône de dessin. Ce visage est également doté d'un déplacement
     * élémentaire horizontal et vertical de +5 pixels.
     */
    public VisageExpressif(int xg, int yg, int larg, int haut, int expression) {
        super(xg, yg, larg, haut);
        this.expression = expression;
    }

    public VisageExpressif(int xg, int yg, Dessin d, int expression) {
        super(xg, yg, d);
        this.expression = expression;
    }

    public VisageExpressif(int xg, int yg, int expression) {
        super(xg, yg);
        this.expression = expression;
    }

    public VisageExpressif(int expression) {
        super();
        this.expression = expression;
    }

    /**
     * Inverse sens du déplacement horizontal.
     */
    @Override
    public void inverserDx() {
        super.inverserDx();
        expression = (expression + 1) % 4;
    }

    /**
     * Inverse sens du déplacement vertical.
     */
    @Override
    public void inverserDy() {
        super.inverserDy();
        expression = (expression + 1) % 4;
    }

    /**
     * affiche le la bouche.
     *
     * @param g le contexte graphique de la zône de dessin en charge de
     * l'affichage.
     *
     * @see java.awt.Graphics
     */
    @Override
    protected void dessinerBouche(Graphics g) {
        // dessiner la bouche
        switch(expression) {
            case 0: {
                g.drawArc(xhg + largeur / 4, yhg + largeur / 8, (2 * largeur) / 4, (2 * hauteur) / 3, 220, 100); 
                break;
            }
            case 1: {
                g.drawArc(xhg + largeur / 4, yhg + 2*largeur / 3, (2 * largeur) / 4, (2 * hauteur) / 3, 50, 80);
                break;
            }
            case 2: 
            {
                g.drawArc(xhg + largeur / 6, yhg + 2*largeur / 3, (2 * hauteur) / 3,largeur / 4,  50, 80);
                break;
            }
            case 3: 
            {
                g.drawOval(xhg + largeur / 3, yhg + 2*largeur / 3, largeur / 4,  hauteur / 4);
                break;
            }
        }
        
    }

} // VisageRond
