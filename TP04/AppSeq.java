public class AppSeq {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------");
        SequenceEntiers seq = new SequenceEntiers();
        System.out.println("Seq("+seq.getLongeur()+") : "+ seq.toString());

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Ajout en tete");
        seq.ajouterEnTete(2);
        System.out.println("2 dans Seq("+seq.getLongeur()+") : "+ seq.toString());
        seq.ajouterEnTete(5);
        System.out.println("5 dans Seq("+seq.getLongeur()+") : "+ seq.toString());

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Ajout en queue");
        seq.ajouterEnQueue(3);
        System.out.println("3 dans Seq("+seq.getLongeur()+") : "+ seq.toString());
        seq.ajouterEnQueue(4);
        System.out.println("4 dans Seq("+seq.getLongeur()+") : "+ seq.toString());

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Element at rang i:");
        System.out.println("Seq[3] = "+seq.getElementI(3)+" dans Seq("+seq.getLongeur()+") : "+ seq.toString());
        System.out.println("Seq[1] = "+seq.getElementI(1)+" dans Seq("+seq.getLongeur()+") : "+ seq.toString());
        //System.out.println("Seq[-1] = "+seq.getElementI(-1)+" dans Seq("+seq.getLongeur()+") : "+ seq.toString());
        //System.out.println("Seq[7] = "+seq.getElementI(7)+" dans Seq("+seq.getLongeur()+") : "+ seq.toString());

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Rangs:");
        System.out.println("Rang(5) = "+ seq.getRang(5)+ "  Seq("+seq.getLongeur()+") : "+ seq.toString());
        System.out.println("Rang(3) = "+ seq.getRang(3)+ "  Seq("+seq.getLongeur()+") : "+ seq.toString());
        System.out.println("Rang(6) = "+ seq.getRang(6)+ "  Seq("+seq.getLongeur()+") : "+ seq.toString());

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Rangs a partir de:");
        System.out.println("RangAPartirDe(5,0) = "+ seq.getRangAPartirDe(5, 0)+ "  Seq("+seq.getLongeur()+") : "+ seq.toString());
        System.out.println("RangAPartirDe(6,0) = "+ seq.getRangAPartirDe(6, 0)+ "  Seq("+seq.getLongeur()+") : "+ seq.toString());
        seq.ajouterEnTete(4);
        System.out.println("RangAPartirDe(4,2) = "+ seq.getRangAPartirDe(4, 2)+ "  Seq("+seq.getLongeur()+") : "+ seq.toString());

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Retirer premier:");
        seq.retirerPremier();
        System.out.println("Seq("+seq.getLongeur()+") : "+ seq.toString());

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Retirer dernier:");
        seq.retirerDernier();
        System.out.println("Seq("+seq.getLongeur()+") : "+ seq.toString());
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Copie:");
        SequenceEntiers seq2 = new SequenceEntiers(seq);
        System.out.println("Seq1("+seq.getLongeur()+") : "+ seq.toString());
        System.out.println("Seq2("+seq2.getLongeur()+") : "+ seq2.toString());
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Copie des impaires:");
        seq2 = seq.filtrerPaires();
        System.out.println("Seq("+seq.getLongeur()+") : "+ seq.toString());
        System.out.println("SeqImpaires("+seq2.getLongeur()+") : "+ seq2.toString());
        
        System.out.println("-------------------------------------------------------------------------------");
        seq2 = seq.filtrerImPaires();
        System.out.println("Seq("+seq.getLongeur()+") : "+ seq.toString());
        System.out.println("SeqPaires("+seq2.getLongeur()+") : "+ seq2.toString());
        
        System.out.println("-------------------------------------------------------------------------------");
    }
}
