/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int length(ListNode head){
        ListNode temp = head;
        int c=0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = length(headA);
        int len2 = length(headB);
        
        if(len1>len2){
            while(len1>len2){
                headA = headA.next;
                len1--;
            }
        }
        else{
             while(len2>len1){
                headB = headB.next;
                len2--;
            }
        }
          while(headA != headB){
                headA = headA.next;
                headB = headB.next;
            }
        return headA;
    }
}