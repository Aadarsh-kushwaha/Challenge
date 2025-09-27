class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        
   
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
       
        ListNode prevLeft = dummy;
        for (int i = 1; i < left; i++) {
            prevLeft = prevLeft.next;
        }
        
        ListNode curr = prevLeft.next;
        
        // Reverse 
        for (int i = 0; i < right - left; i++) {
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prevLeft.next;
            prevLeft.next = nextNode;
        }
        
        return dummy.next;
    }
}