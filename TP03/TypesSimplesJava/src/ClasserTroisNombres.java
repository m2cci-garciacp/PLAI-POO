import java.util.Scanner;

public class ClasserTroisNombres{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1er nombre : ");
        int premier = sc.nextInt();
        System.out.print("2er nombre : ");
        int seconde = sc.nextInt();
        System.out.print("3er nombre : ");
        int troisieme = sc.nextInt();

        int tmp = Math.min(premier, seconde);
        premier = Math.max(premier, seconde);
        seconde = tmp;
        
        if (premier<troisieme)
        {
            tmp = troisieme;
            troisieme = seconde;
            seconde = premier;
            premier = tmp;
        } else if (seconde<troisieme) {
            tmp = troisieme;
            troisieme = seconde;
            seconde = tmp;
        }

        System.out.printf("Les nombres dans l'ordre croissant : %d %d %d\n", troisieme, seconde, premier);

        sc.close();
    }
}
