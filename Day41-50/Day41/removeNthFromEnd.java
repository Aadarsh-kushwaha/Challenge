public ListNode removeCycle(ListNode head) {
    if (head == null || head.next == null) return head;

    ListNode slow = head, fast = head;
    ListNode beg = null; // cycle start node

    // Step 1: Detect cycle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (fast == slow) { // Cycle found
            // Step 2: Find start of cycle
            beg = head;
            while (beg != slow) {
                beg = beg.next;
                slow = slow.next;
            }
            break; // exit after finding cycle start
        }
    }

    // Step 3: If cycle was found, break it
    if (beg != null) {
        ListNode prev = beg;
        while (prev.next != beg) {
            prev = prev.next;
        }
        prev.next = null;
    }

    return head;
}
