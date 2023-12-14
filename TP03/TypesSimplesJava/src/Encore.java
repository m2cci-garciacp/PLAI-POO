import java.util.Scanner;

public class Encore {
    public Encore() {}

    public char next(Scanner sc) {        
        char q;

        System.out.print("\nVoulez-vous essayer un autre nombre O/N ?  ");
        q=sc.next().charAt(0);
        System.out.println("");
        
        return q;
    }
}
