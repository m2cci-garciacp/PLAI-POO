import java.util.Scanner;

public class Jhms{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donnez une durée en secondes : ");
        int secs = sc.nextInt();

        int min = secs / 60;
        secs = secs % 60;
        int hours = min / 60;
        min = min % 60;
        int jours = hours / 24;
        hours = hours % 24;
        
        System.out.print("Cette durée équivaut à ");
        if (jours!=0) 
        {
            System.out.print(jours + " jour" + ((jours>1)?"s":""));
        }
        if (hours!=0) 
        {
            System.out.print(((jours!=0)?((secs==0)?((min==0)?" et ":","):((min==0)?" et ":",")):"") + hours + " heure" + ((hours>1)?"s":""));
        }
        if (min!=0) 
        {
            System.out.print(((secs==0)?" et ":(((jours+hours)!=0)?", ":"")) + min + " minute" + ((min>1)?"s":""));
        }
        if (secs!=0) 
        {
            System.out.print((((jours+hours+min)!=0)?" et ":"") + secs + " seconde" + ((secs>1)?"s":""));
        }
        System.out.println(".");

        sc.close();
    }
}
