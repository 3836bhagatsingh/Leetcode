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
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while(temp != null){
            sb.append(temp.val);
            temp = temp.next;
        }
        String s = sb.toString();
        int ans =0;
        int power=0;
        int i=s.length()-1;
        while(i>=0){
            int a = Character.getNumericValue(s.charAt(i));
            ans = ans + (int)(a*(Math.pow(2,power)));
            power++;
            i--;
        }
        return ans;


        
    }
}