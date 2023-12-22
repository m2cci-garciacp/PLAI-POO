import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Class representant un semble de lettres de 'a' a 'z'.
 */
public class EnsembleDeLettres {
    ////////////////////////////////////////////////////////
    //                   variables                        //
    ////////////////////////////////////////////////////////
    /**
     * Variable tableau, qui stocke l'appartenance de la lettre a l'ensemble.
     */
    private boolean[] ensemble = new boolean[26];
    /**
     * String alphabet avec toute les lettres de l'alphabet.
     */
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    ////////////////////////////////////////////////////////
    //                   constructeurs                    //
    ////////////////////////////////////////////////////////
    /**
     * Cree un ensemble vide.
     */
    public EnsembleDeLettres() {}

    /**
     * Cree un ensemble a partir des lettres d'un string.
     * @param s string a partir de laquelle on construit l'ensemble.
     */
    public EnsembleDeLettres(String s) {
        int i;
        s=s.toLowerCase();
        for( char c : s.toCharArray()) {
            i = alphabet.indexOf(c);
            if (i!=-1) {
                ensemble[i] = true;
            }
        }
    }

    /**
     * Cree un ensemble a partir de n lettres differentes tirees au hazard
     * @param n nombre de lettres a inserer dans l'ensemble.
     */
    public EnsembleDeLettres(int n) {
        Integer[] array = new Integer[26];
        for (int i=0; i<26; i++) {array[i]=i;}

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        // Shuffle the list using Collections.shuffle()
        Collections.shuffle(list);
    
        // Convert the shuffled list back to an array
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        for (int i=0; i<n; i++) {
            ensemble[shuffledArray[i]]=true;
        }
    }

    ////////////////////////////////////////////////////////
    //                   methodes                         //
    ////////////////////////////////////////////////////////
    /**
     * Transforme le ensemble en string, enferme entre acolades
     * et separes avec des commas.
     * <br>
     * Exemple : ensemble de ['q', 'r', 'l'] => "{q, r, l}"
     * 
     * @return l'ensemble en format string.
     */
    public String toString() {
        String s = "{";

        if (estVide()) {return "{}";}

        for (int i=0;i<26; i++) {
            if (ensemble[i]) {s = String.format("%s'%c', ", s, alphabet.charAt(i));}
        }
        s = s.substring(0, s.length()-2);
        return s.concat("}");
    }

    /**
     * Donne si l'ensemble est vide ou pas.
     * @return true si l'ensemble est vide, false en cas contraire.
     */
    public boolean estVide() {
        return getCardinalite()==0;
    }

    /**
     * Donne la cardinalité de l'ensemble.
     * @return la cardinalité de l'ensemble.
     */
    public int getCardinalite() {
        int c=0;
        for (int i=0; i<26; i++) {
            if (ensemble[i]) {c++;}
        }
        return c;
    }

    /**
     * Verifie si cet ensemble est inclu dans l'ensemble donné.
     * @param e ensemble à vérifier l'inclusion.
     * @return true si cet ensembleest inclu dans l'ensemble donné, false au cas contraire.
     */
    public boolean estInclu(EnsembleDeLettres e) {
        for (int i=0; i<26; i++) {
            if (!e.getEnsemble()[i] && ensemble[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Vérifie si la lettre, c, est dans l'ensemble.
     * @param c lettre a verifier s'elle est dans l'ensemble.
     * @return true si l'ensemble contient c, false en cas contraire.
     */
    public boolean contient(char c) {
        int i = alphabet.indexOf(c);
        return i!=-1 && ensemble[i];
    }

    /**
     * Cree un nouveau ensemble avec l'union entre cet ensemble et l'ensemble donné (A ∪ B).
     * 
     * @param e ensemble avec lequel faire l'union.
     * @return un nouveau ensemble avec l'union entre cet ensemble et l'ensemble donné.
     */
    public EnsembleDeLettres creerUnionAvec(EnsembleDeLettres e) {
        EnsembleDeLettres union = new EnsembleDeLettres();
        boolean[] ensembleUnion = union.getEnsemble();
        boolean[] ensembleInput = e.getEnsemble();

        for(int i=0; i<26;i++) {
            ensembleUnion[i] = ensembleInput[i] || ensemble[i];
        }
        union.setEnsemble(ensembleUnion);
        return union;
    }

    /**
     * Cree un nouveau ensemble avec l'intersection entre cet ensemble avec l'ensemble donné (A ∩ B).
     * @param e ensemble avec lequel faire l'intersection.
     * @return un nouveau ensemble avec l'intersection entre cet ensemble et l'ensemble donné.
     */
    public EnsembleDeLettres creerIntersectionAvec(EnsembleDeLettres e) {
        EnsembleDeLettres intersection = new EnsembleDeLettres();
        boolean[] ensembleIntersection = intersection.getEnsemble();
        boolean[] ensembleInput = e.getEnsemble();

        for(int i=0; i<26;i++) {
            ensembleIntersection[i] = ensembleInput[i] && ensemble[i];
        }
        intersection.setEnsemble(ensembleIntersection);
        return intersection;
    }

    /**
     * Cree un nouveau ensemble avec la différence de cet ensemble avec l'ensemble donné (cet ensemble \ autre ensemble).
     * @param e ensemble avec lequel faire la différence.
     * @return un nouveau ensemble résultant de la différence entre cet ensemble et l'ensemble donné.
     */
    public EnsembleDeLettres creerDifferenceAvec(EnsembleDeLettres e) {
        EnsembleDeLettres intersection = new EnsembleDeLettres();
        boolean[] ensembleIntersection = intersection.getEnsemble();
        boolean[] ensembleInput = e.getEnsemble();

        for(int i=0; i<26;i++) {
            ensembleIntersection[i] = ensemble[i] && !ensembleInput[i];
        }
        intersection.setEnsemble(ensembleIntersection);
        return intersection;
    }

    /**
     * Cree un nouveau ensemble avec l'union disjointe entre cet ensemble et l'ensemble donné (A Δ B).
     * @param e ensemble avec lequel faire l'union disjointe.
     * @return l'ensemble union disjointe entre cet ensemble et l'ensemble donné.
     */
    public EnsembleDeLettres creerUnionDisjointeAvec(EnsembleDeLettres e) {
        EnsembleDeLettres unionDisjointe = new EnsembleDeLettres();
        boolean[] ensembleUnionDisjointe = unionDisjointe.getEnsemble();
        boolean[] ensembleInput = e.getEnsemble();

        for(int i=0; i<26;i++) {
            ensembleUnionDisjointe[i] = ensemble[i] ^ ensembleInput[i];
        }
        unionDisjointe.setEnsemble(ensembleUnionDisjointe);
        return unionDisjointe;
    }

    /**
     * Donne cet ensemble comme un tableau des booleans, representant l'inclusion de chaque lettre en ordre alphabetique.
     * @return ensemble comme un tableau des booleans.
     */
    public boolean[] getEnsemble() {
        return ensemble;
    }

    /**
     * Mettre a jour le ensemble avec un tableau de booleans.
     * @param e tableau des booleans.
     */
    public void setEnsemble(boolean[] e) {
        ensemble = Arrays.copyOf(e,26);
    }
    
}
