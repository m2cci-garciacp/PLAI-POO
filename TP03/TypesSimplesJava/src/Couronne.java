import java.util.Scanner;

public class Couronne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rayon exterieur : ");
        double rayonExt = sc.nextDouble();
        System.out.print("Rayon interieur : ");
        double rayonInt = sc.nextDouble();
        System.out.print("x = ");
        double x = sc.nextDouble();
        System.out.print("y : ");
        double y = sc.nextDouble();

        double rayon = Math.sqrt(Math.pow(x,2.0)+Math.pow(y,2.0));

        if (rayonExt>=rayon && rayonInt<=rayon) {
            System.out.println("Point dans la couronne.");
        } else {
            System.out.println("Point hors de la couronne.");
        }

        sc.close();
    }
}
