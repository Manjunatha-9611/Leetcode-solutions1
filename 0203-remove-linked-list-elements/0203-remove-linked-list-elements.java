/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //bruteforce my way
        if (head == null) {
            return null;
        }
        while (head != null && head.next != null && head.val == val)
            head = head.next;

            
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val != val) {
                curr = curr.next;
            } else {
                curr.next = curr.next.next;
            }
        }
        if (curr != null && curr.val != val) {
            return head;
        } else {
            return curr.next;
        }

        // ListNode dummy = new ListNode(0);
        // dummy.next = head;
        // ListNode curr = dummy;
        // while (curr != null && curr.next != null) {
        //     if (curr.next.val == val) {
        //         curr.next = curr.next.next;
        //     } else {
        //         curr = curr.next;
        //     }
        // }
        // return dummy.next;
    }
}