package medium;

/**
 * Created by stengali on 1/19/18.
 */
public class SwapNodesInPair {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while(current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        SwapNodesInPair obj = new SwapNodesInPair();
        System.out.println();
    }
}
