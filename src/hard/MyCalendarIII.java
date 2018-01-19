package hard;

import java.util.TreeMap;

/**
 * Created by stengali on 1/18/18.
 */
public class MyCalendarIII {

    private TreeMap<Integer, Integer> timeline = new TreeMap<>();
    public int book(int s, int e) {
        timeline.put(s, timeline.getOrDefault(s, 0) + 1); // 1 new event will be starting at [s]
        timeline.put(e, timeline.getOrDefault(e, 0) - 1); // 1 new event will be ending at [e];
        int ongoing = 0, k = 0;
        for (int v : timeline.values())
            k = Math.max(k, ongoing += v);
        return k;
    }

    public static void main(String[] args) {
        MyCalendarIII obj = new MyCalendarIII();
        System.out.println(obj.book(1,5));
        System.out.println(obj.book(7,9));
        System.out.println(obj.book(2,3));
        System.out.println(obj.book(3,4));
        System.out.println(obj.book(3,4));
        System.out.println(obj.book(8,9));

    }
}
