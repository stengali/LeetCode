package medium;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by stengali on 1/19/18.
 */
public class CalendarI {

    TreeMap<Integer, Integer> calendar;
    public CalendarI() {
        calendar = new TreeMap<>();
    }
    public boolean book(int start, int end) {
        Integer floorKey = calendar.floorKey(start);
        if(floorKey != null && calendar.get(floorKey) > start)
            return false;
        Integer ceilingKey = calendar.ceilingKey(start);
        if(ceilingKey != null && ceilingKey < end)
            return false;

        calendar.put(start, end);
        return true;
    }

    public static void main(String[] args) {
        CalendarI obj = new CalendarI();
        System.out.println(obj.book(10,25));
        System.out.println(obj.book(9,10));
        System.out.println(obj.book(10,11));
        System.out.println(obj.book(100,25));
        System.out.println(obj.book(100,125));
    }
}
