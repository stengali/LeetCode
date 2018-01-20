package hard;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by stengali on 1/20/18.
 */

public class LeastFrequentlyUsedCache {

    long stamp;
    int capacity;
    int num;
    PriorityQueue<Pair> minHeap;
    HashMap<Integer, Pair> hashMap;

    public LeastFrequentlyUsedCache(int capacity) {
        // Write your code here
        this.capacity = capacity;
        num = 0;
        minHeap = new PriorityQueue<Pair>();
        hashMap = new HashMap<Integer, Pair>();
        stamp = 0;
    }

    public void set(int key, int value) {
        if (capacity == 0) {
            return;
        }
        // Write your code here
        if (hashMap.containsKey(key)) {
            Pair old = hashMap.get(key);
            minHeap.remove(old);

            Pair newNode = new Pair(key, value, old.times + 1, stamp++);

            hashMap.put(key, newNode);
            minHeap.offer(newNode);
        } else if (num == capacity) {
            Pair old = minHeap.poll();
            hashMap.remove(old.key);

            Pair newNode = new Pair(key, value, 1, stamp++);

            hashMap.put(key, newNode);
            minHeap.offer(newNode);
        } else {
            num++;
            Pair pair = new Pair(key, value, 1, stamp++);
            hashMap.put(key, pair);
            minHeap.offer(pair);
        }
    }

    public int get(int key) {
        if (capacity == 0) {
            return -1;
        }
        // Write your code here
        if (hashMap.containsKey(key)) {
            Pair old = hashMap.get(key);
            minHeap.remove(old);

            Pair newNode = new Pair(key, old.value, old.times + 1, stamp++);

            hashMap.put(key, newNode);
            minHeap.offer(newNode);
            return hashMap.get(key).value;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        LeastFrequentlyUsedCache obj = new LeastFrequentlyUsedCache(3);
        obj.set(4,4);
        obj.set(4,5);
        obj.set(4,5);
        obj.set(4,5);
        obj.set(1,1);
        obj.set(2,2);
        obj.set(3,3);

        System.out.println(obj.get(1));
    }
}

class Pair implements Comparable<Pair> {
    long stamp;
    int key;
    int value;
    int times;

    public Pair(int key, int value, int times, long stamp) {
        this.key = key;
        this.value = value;
        this.times = times;
        this.stamp = stamp;
    }
    /* this compareTo method will make LFU to work as LRU by comparing the timestamp.
    public int compareTo(Pair that) {
        return (int) (this.stamp - that.stamp);
    }
    */
    public int compareTo(Pair that) {
        if (this.times == that.times) {
            return (int) (this.stamp - that.stamp);
        } else {
            return this.times - that.times;
        }
    }
}