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
    public static int length(ListNode temp){
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
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if(len1>len2){
            while(len1>len2){
                temp1 = temp1.next;
                len1--;
            }
        }
        else{
              while(len1<len2){
                temp2 = temp2.next;
                len2--; 
            }

        }
        while(temp1!=null && temp2!=null){
            if(temp1==temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}