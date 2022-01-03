import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date today = new Date ();

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");

        System.out.println("오늘 날짜 " + date.format(today));
        System.out.println("현재 시간 " + time.format(today));
    }
    
}
