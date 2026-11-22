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
    public ListNode swapPairs(ListNode head) {
        // ListNode curr = head;    -> BF fails becoz (Restrictions Failed : Line 16: You are not allowed to modify node values; you must relink the nodes instead.)
        // while(curr!=null && curr.next!=null){
        //     int temp = curr.val;
        //     curr.val = curr.next.val;
        //     curr.next.val = temp;
        //     curr = curr.next.next;
        // }
        // return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(prev.next != null && prev.next.next != null){
            ListNode first = prev.next;
            ListNode second = first.next;

            first.next = second.next;
            prev.next = second;

            second.next = first;

            prev = first;
           // prev = prev.next.next;
        }

        return dummy.next;
    }
}