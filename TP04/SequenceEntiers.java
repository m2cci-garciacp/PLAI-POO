public class SequenceEntiers {
    private ElementSeqEntier tete = null;
    private ElementSeqEntier queue = null;
    private int longeur = 0;

    public SequenceEntiers() {
    }

    public SequenceEntiers(SequenceEntiers s) {
        ElementSeqEntier ac = s.tete;

        while( ac != null){
            ajouterEnQueue(ac.getX());
            ac = ac.getNext();
        }
    }

    public String toString() {
        ElementSeqEntier ac = tete;
        String s = "[";

        while (ac != null) {
            s += ac.getX() + ", ";
            ac = ac.getNext();
        }
        s += "]";

        return s;
    }

    public void ajouterEnTete(int x) {

        if (estVide()) {
            // ajout dans liste vide
            creerSingleton(x);
        } else {
            // ajout dans liste non-vide
            tete = new ElementSeqEntier(x, tete);
            longeur++;
        }
    }

    public void ajouterEnQueue(int x) {
        if (estVide()) {
            // ajout dans liste vide
            creerSingleton(x);
        } else {
            // ajout dans liste non vide
            queue.setNext(new ElementSeqEntier(x));
            queue = queue.getNext();
            longeur++;
        }

    }

    private void creerSingleton(int x) {
        queue = tete = new ElementSeqEntier(x);
        longeur = 1;
    }

    public void retirerPremier() {
        if (!estVide()) {
            tete = tete.getNext();
            longeur--;
        }
    }

    public void retirerDernier() {
        if (estVide()) {
            return ;
        } else if (longeur == 1) {
            tete = queue = null;
        } else {

            ElementSeqEntier ac = tete;

            while (ac.getNext() != queue) {
                ac = ac.getNext();
            }

            queue = ac;
            queue.setNext(null);
        }
        longeur--;
    }

    public int getElementI(int i) {
        if (longeur < i)
            throw new IllegalArgumentException("Rang trop grand");
        else if (1 > i)
            throw new IllegalArgumentException("Rang trop petit");

        ElementSeqEntier ac = tete;
        int rang = 1;

        while (ac != null && rang != i) {
            ac = ac.getNext();
            rang++;
        }

        return ac.getX();
    }

    public int getRang(int x) {
        return getRangAPartirDe(x, 0);
    }

    public int getRangAPartirDe(int x, int i) {
        ElementSeqEntier ac = tete;
        int rang = 1;

        while (ac != null) {
            if (ac.getX()==x && i<=rang) {
                return rang;
            }
            ac = ac.getNext();
            rang++;
        }

        return -1;
    }

    public int getLongeur() {
        return longeur;
    }

    public SequenceEntiers filtrerPaires() {
        SequenceEntiers tete2 = new SequenceEntiers();
        ElementSeqEntier ac = tete;

        while( ac != null){
            if (ac.getX()%2!=0) {
                tete2.ajouterEnQueue(ac.getX());
            }
            ac = ac.getNext();
        }
        return tete2;
    }
    public SequenceEntiers filtrerImPaires() {
        SequenceEntiers tete2 = new SequenceEntiers();
        ElementSeqEntier ac = tete;

        while( ac != null){
            if (ac.getX()%2==0) {
                tete2.ajouterEnQueue(ac.getX());
            }
            ac = ac.getNext();
        }
        return tete2;
    }

    public boolean estVide() {
        return longeur==0;
    }
}
