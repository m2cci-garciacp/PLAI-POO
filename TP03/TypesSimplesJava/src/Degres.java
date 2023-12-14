import java.util.Locale;
import java.util.Scanner;

public class Degres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        System.out.print("Donnez une temperature en Fahrenheit : ");
        double tempF = sc.nextDouble();
        double tempC = 5*(tempF-32.0)/9; 
        System.out.printf("Cette temperature equivaut a %.2f degres Celsius\n", tempC);

        sc.close();
    }
}
