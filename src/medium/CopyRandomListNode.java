package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by stengali on 1/21/18.
 */

class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
}

public class CopyRandomListNode {

    public RandomListNode copyRandomListPointer(RandomListNode head) {
        if(head == null)
            return null;

        RandomListNode node = head;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();

        while (node != null) {
            map.put(node, new RandomListNode(node.label));
            node = node.next;
        }

        node = head;
        while (node != head) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }
    public static void main(String[] args) {
        CopyRandomListNode obj = new CopyRandomListNode();
        System.out.println();
    }
}
