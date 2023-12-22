
/**
 * App main
 */    
public class App {
    /**
     * App main
     */    
    public App (){}

    /**
     * Mind bidon
     */    
    public static void main(String[] args) {
        //
        EnsembleDeLettres e = new EnsembleDeLettres("qbcf");
        System.out.printf("e : %s\n",e);
        //
        EnsembleDeLettres d = new EnsembleDeLettres(4);
        System.out.printf("d : %s\n",d);
        System.out.printf("card : %d %s\n", d.getCardinalite(),d.estVide()?"vide":"pas vide");
        //
        EnsembleDeLettres f = new EnsembleDeLettres();
        System.out.printf("f : %s\n",f);
        System.out.printf("card : %d %s\n", f.getCardinalite(),f.estVide()?"vide":"pas vide");
        //
        EnsembleDeLettres g = new EnsembleDeLettres("qbacx");
        System.out.printf("g : %s\n",g);
        System.out.printf("Inclusion e en g: %s\n", e.estInclu(g)?"inclu":"ne inplu pas");
        System.out.printf("Inclusion d en g: %s\n", d.estInclu(g)?"inclu":"ne inplu pas");
        System.out.printf("Inclusion f en g: %s\n", f.estInclu(g)?"inclu":"ne inplu pas");
        //
        System.out.printf("g contien 'a': %s\n", g.contient('a')?"oui":"nein");
        System.out.printf("g contien 'z': %s\n", g.contient('z')?"oui":"nein");
        //
        System.out.printf("g union e: %s\n", g.creerUnionAvec(e));
        System.out.printf("g union d: %s\n", g.creerUnionAvec(d));
        //
        System.out.printf("g intersection e: %s\n", g.creerIntersectionAvec(e));
        System.out.printf("g intersection d: %s\n", g.creerIntersectionAvec(d));
        //
        System.out.printf("g difference e: %s\n", g.creerDifferenceAvec(e));
        System.out.printf("g difference d: %s\n", g.creerDifferenceAvec(d));
        //
        System.out.printf("g union disjointe e: %s\n", g.creerUnionDisjointeAvec(e));
        System.out.printf("g union disjointe d: %s\n", g.creerUnionDisjointeAvec(d));

    }
    
}
