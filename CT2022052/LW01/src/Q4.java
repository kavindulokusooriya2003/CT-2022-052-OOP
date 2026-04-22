import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Q4 {
    public static void main(String[] args) {
        Date today =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM YYYY");
        System.out.println(sdf.format(today));
    }
}
