package hard;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by stengali on 1/18/18.
 */
public class MedianFromDataStream {



    PriorityQueue<Integer> min = new PriorityQueue();
    PriorityQueue<Integer> max = new PriorityQueue(1000, Collections.reverseOrder());
    // Adds a number into the data structure.
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if (max.size() < min.size()){
            max.offer(min.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if (max.size() == min.size()) return (max.peek() + min.peek()) /  2.0;
        else return max.peek();
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
