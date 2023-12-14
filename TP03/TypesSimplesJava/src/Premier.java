import java.util.Scanner;

public class Premier{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Encore encore = new Encore();
        char q;
        int i;
        int x;

        do
        {
            System.out.print("Donnez un nombre positif: ");
            x = sc.nextInt();

            if (x==1) {
                System.out.println("1 es premier?"); 
            } else if (x<=0) {
                System.out.println("Nombre positifs. J'AI DIT"); 
            } else {
                for (i=2; i<0.5*x; i++) {
                    if (x%i==0) {
                        System.out.printf("%d n'est pas premier, il est divisible par %d\n",x, i);
                        break;
                    }
                }
                if (i>=0.5*x) {System.out.printf("%d est premier\n",x);}
            }        
            
            q=encore.next(sc);

        } while (q=='O' || q=='o');

        sc.close();
    }
}
