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
    public int length(ListNode head){
        ListNode temp = head;
        int count =0;
        while(temp!=null){
            count++;
            temp  = temp.next;
        }
        return count;
    }
    public boolean check(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        int len = length(head);
        int[] arr = new int[len];
        ListNode temp = head;
        int k=0;
        while(temp != null){
            arr[k++] = temp.val;
            temp = temp.next;
        }
        return check(arr);
        
    }
}