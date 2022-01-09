import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Date> list = new ArrayList<>();
        list.add(new Date());
        print(list);

        list.add(new Date(System.currentTimeMillis() + 86400000));
        print(list);
    }

    static void print(ArrayList<Date> list) {
        for (Date date : list) {
            System.out.println(date.getTime());   
        }
    }
}
