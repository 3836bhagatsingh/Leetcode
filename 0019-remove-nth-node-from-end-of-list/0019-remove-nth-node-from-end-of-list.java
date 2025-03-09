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
        ListNode first = head,second = head;
        int i=0;
        while(i<n){
            second = second.next;
            i++;
        }
          if (second == null) {
            return head.next; 
        }
        while(second.next != null){
            first = first.next;
            second = second.next;
        }
      
        first.next = first.next.next;
        return head;

        
    }
}