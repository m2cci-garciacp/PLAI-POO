import java.util.Scanner;

public class MoyenneOlympique{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        int n = 0;
        double somme = 0;
        double tmp;

        System.out.print("Donnez une note ( >=0 ou -1 pour arrêter): ");
        tmp = sc.nextDouble();
        while (tmp>=0) {
            min = Math.min(min, tmp);
            max = Math.max(max, tmp);
            n++;
            somme+=tmp;
            System.out.print("Donnez une note ( >=0 ou -1 pour arrêter): ");
            tmp = sc.nextDouble();
        }

        if (n>2) {
            System.out.printf("La note la plus élevée (%.2f)et la note plus basse (%.2f) ont été retirées.\n", max, min);
            System.out.printf("La moyenne olympique est %.2f\n", (somme-min-max)/(n-2));
        } else if (n==0) {
            System.out.printf("Pas d'elements pour faire une moyenne olympique.\n");
        } else {
            System.out.printf("Pas assez d'elements pour faire la moyenne olympique. La moyenne est %.2f\n", somme/n);
        }

        sc.close();
    }
}
