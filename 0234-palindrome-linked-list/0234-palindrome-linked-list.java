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


        public ListNode reverse(ListNode head){
            ListNode res = null;
            ListNode curr = head;
            while(curr!=null){
                ListNode temp = new ListNode(curr.val);
                temp.next = res;
                res = temp;
                curr = curr.next;
            }
            return res;
        }


        public boolean isPalindrome(ListNode head) {

            // ArrayList<Integer> list = new ArrayList<>();
            // ListNode curr = head;
            // while(curr!=null){
            //     list.add(curr.val);
            //     curr = curr.next;
            // }    
            // int left = 0;
            // int right = list.size()-1;
            // while(left < right){
            //     if(list.get(left) != list.get(right))
            //         return false;
                
            //     right--;
            //     left++;
            
            
            // }
            //  return true;




            //  ListNode res = null;
            // ListNode curr = head;
            // while(curr!=null){
            //     ListNode temp = new ListNode(curr.val);
            //     temp.next = res;
            //     res = temp;
            //     curr = curr.next;
            // }

            // curr = head;
            // while(curr!=null){
            //     if(res.val != curr.val){
            //         return false;
            //     }
            //     curr = curr.next;
            //     res = res.next;
            // }
            // return true;


            ListNode slow = head;
            ListNode fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode p1 = head;
            ListNode p2 = reverse(slow);
            while(p2!=null){
                if(p1.val != p2.val){
                    return false;
                }
                p1 = p1.next;
                p2 = p2.next;
            }

            return true;
        }
    }