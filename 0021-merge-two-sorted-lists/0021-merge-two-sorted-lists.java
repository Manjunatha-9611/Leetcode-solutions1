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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // //bruteforce
        
        // List<Integer> sorted = new ArrayList<Integer>();
     
        // while(list1 != null){
        //     sorted.add(list1.val);
        //     list1 = list1.next;
        // }
        // while(list2 != null){
        //     sorted.add(list2.val);
        //     list2 = list2.next;
        // }

        // Collections.sort(sorted);
        // ListNode dummy = new ListNode(0);
        // ListNode curr = dummy;

        //  simple for -loop
        // for(int i = 0; i< sorted.size(); i++){
        //     ListNode temp = new ListNode(sorted.get(i));
        //     curr.next = temp;
        //     curr = curr.next;
        // }
        // return dummy.next;


        // //forEach loop

        // for(int data : sorted){
        //     ListNode temp = new ListNode(data);
        //     curr.next = temp;
        //     curr = curr.next;
        // }
        // return dummy.next;


        //optimizing
        //Without creating a list and sorting -> instead we are modifying in the dummy node itself

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2  = list2.next;
            }
            curr = curr.next;
        }

        if(list1 != null){
            curr.next = list1;
        }else{
            curr.next = list2;
        }

        return dummy.next;


        //Without creating any dummy node
    //    ListNode curr = null;
    //     if(list1.val < list2.val){
    //         curr = list1;
    //     }
    //     else{
    //         curr = list2;
    //     }
    //     while(list1 != null && list2 != null){
    //         if(list1.val < list2.val){
    //             curr.next = list1;
    //             list1 = list1.next;
    //         }
    //         else{
    //             curr.next = list2;
    //             list2  = list2.next;
    //         }
    //         curr = curr.next;
    //     }

    //     if(list1 != null){
    //         curr.next = list1;
    //     }else{
    //         curr.next = list2;
    //     }

    //     return list1.val < list2.val ? list1 : list2;
    }
}