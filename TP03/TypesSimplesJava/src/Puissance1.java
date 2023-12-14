import java.util.Scanner;

public class Puissance1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        int somme = 1;

        System.out.print("x^n = ");

        if (n==0) {
            if (x>=0) {
                System.out.println("1");
            } else {
                System.out.println("Undefined");
            }
        } else if (x==0) {
            if (n>0) {
                System.out.println("0");
            } else {
                System.out.println("Undefined");
            }
        } else {
            for (int i=0; i<((n<0)?-n:n); i++)
            {
                somme *= x;
            }
            if (n<0) {
                System.out.printf("%.4f\n", 1.0/somme);
            } else {
                System.out.printf("%d\n", somme);
            }
        }

        sc.close();
    }
}
