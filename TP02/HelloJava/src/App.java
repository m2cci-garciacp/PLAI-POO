import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i=0; i<n;i++) {
            System.out.println(i);
        }
        System.out.println("Bye Bye World !");
    }
}
