import java.util.GregorianCalendar;
//import java.util.Calendar;
import java.time.LocalTime;

public class AfficherHeure {

    public static void main(String[] args) {

        LocalTime t = LocalTime.now();
        GregorianCalendar cal = new GregorianCalendar();
        System.out.print("il est " + t.getHour() + " h ");
        System.out.print(t.getMinute() + " m ");
        System.out.println(t.getSecond() + " s");
        System.out.print("il est " + cal.get(GregorianCalendar.HOUR_OF_DAY) + " h ");
        System.out.print(cal.get(GregorianCalendar.MINUTE) + " m ");
        System.out.println(cal.get(GregorianCalendar.SECOND) + " s");
    }
}