package easy;

/**
 * Created by stengali on 1/23/18.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next!=null ) {
            slow = slow.next;
            fast=fast.next.next;
            if(fast == slow)
                return true;
        }
        return false;

    }
    public static void main(String[] args) {
        LinkedListCycle obj = new LinkedListCycle();
        System.out.println();
    }
}
