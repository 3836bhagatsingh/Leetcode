class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null; // Handle single-node case

        ListNode slow = head, fast = head;
        ListNode prev = null; // Track the previous node of slow

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next; // Delete middle node
        return head;
    }
}
