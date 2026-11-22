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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();

        int count=1;
        for (int i = 1; i < left; i++) {
            curr = curr.next;
            count++;
        }
        while (curr != null&& count <= right) {
           
            list.add(curr.val);
             curr = curr.next;
             count++;
        }

        curr = head;
        count=1;
        int index = list.size()-1;
        for (int i = 1; i < left; i++) {
            curr = curr.next;
            count++;
        }
        while (curr != null &&count <=right) {
            curr.val = list.get(index);
            index--;
            curr = curr.next;
            count++;
        }
        
        return head;
    }
}