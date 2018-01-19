package hard;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by stengali on 1/18/18.
 */
public class MedianFromDataStream {

    private Queue<Long> small = new PriorityQueue(),
            large = new PriorityQueue();

    public void addNum(int num) {
        large.add((long) num);
        small.add(-large.poll());
        if (large.size() < small.size())
            large.add(-small.poll());
    }

    public double findMedian() {
        return large.size() > small.size()
                ? large.peek()
                : (large.peek() - small.peek()) / 2.0;
    }

    public static void main(String[] args) {
        MedianFromDataStream obj = new MedianFromDataStream();
        obj.addNum(1);
        obj.addNum(2);
        obj.addNum(3);
        obj.addNum(4);
        System.out.println(obj.findMedian());
        obj.addNum(5);
        obj.addNum(6);
        obj.addNum(7);
        System.out.println(obj.findMedian());
        obj.addNum(8);
        obj.addNum(9);
        obj.addNum(10);
        System.out.println(obj.findMedian());



        System.out.println();
    }
}
