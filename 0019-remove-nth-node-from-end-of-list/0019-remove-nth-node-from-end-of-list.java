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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode curr = head;
        // int length = 0;
        // while(curr!=null){
        //     curr = curr.next;
        //     length++;
        // }
        // 
        // if(length - n == 0){
        //     return head.next;
        // }
        // curr = head;
        // for(int i = 1; i<length-n;i++){
        //     curr = curr.next;
        // }
        // curr.next = curr.next.next;
        // return head;

        // ListNode curr = head;

        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}