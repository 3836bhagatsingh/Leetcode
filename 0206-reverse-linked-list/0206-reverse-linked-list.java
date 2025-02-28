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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            li.add(temp.val);
            temp=temp.next;
        }
        ListNode ans = new ListNode(-1);
        ListNode head1 = ans;
        for(int i = li.size()-1;i>=0;i--){
            ListNode temp1 = new ListNode(li.get(i));
            head1.next = temp1;
            head1 = head1.next;
        }
        return ans.next;
        
    }
}