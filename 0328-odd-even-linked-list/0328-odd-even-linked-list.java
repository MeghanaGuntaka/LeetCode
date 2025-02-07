class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Return if the list has 0 or 1 node
        }

        ListNode odd = head;          // Points to the first odd node
        ListNode even = head.next;     // Points to the first even node
        ListNode evenHead = even;      // Stores the head of even nodes

        while (even != null && even.next != null) {
            odd.next = even.next;      // Connect odd node to the next odd node
            odd = odd.next;            // Move odd pointer forward
            even.next = odd.next;      // Connect even node to the next even node
            even = even.next;          // Move even pointer forward
        }

        odd.next = evenHead;  // Merge even list after odd list
        return head;
    }
}
