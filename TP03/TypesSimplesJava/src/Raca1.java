import java.util.Scanner;

public class Raca1 {
    static final double EPS = 1E-5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Donner numero entre 1 et 1000 : ");
        double x = sc.nextDouble();

        while (x<=1){
            System.out.print("Le numero doit etre plus grand que 1.\nDonner numero entre 1 et 1000 : ");
            x = sc.nextDouble();
        }
        
        double u = 0.5*x;

        int counter = 0;

        while ( Math.abs(u*u-x)>=EPS) {
            u = (u + x / u) * 0.5;
            System.out.printf("u%d = %.5f\n", counter, u);
            counter++;
        }
        

        System.out.printf("Valeur approchée de la sqrt(%.5f) = %.5f\n", x, u);

        sc.close();
    }
}
