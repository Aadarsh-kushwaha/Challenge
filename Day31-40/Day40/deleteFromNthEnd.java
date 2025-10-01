class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //  Find the size of the list
        int sz = 0;
        ListNode temp = head;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }

        // to remove the first node
        if (n == sz) {
            return head.next;
        }

        // node before the one to remove
        temp = head;
        for (int i = 1; i < sz - n; i++) { 
            temp = temp.next;
        }

        //  Remove the nth node from the end
        temp.next = temp.next.next;

        return head;
    }
}
