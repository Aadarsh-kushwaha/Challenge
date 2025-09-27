public class ZigZagLL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static void ZigZag() {
        if (head == null || head.next == null) return;

        // Step 1: Find middle (slow-fast pointer)
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Split and reverse second half
        Node mid = slow;
        Node curr = mid.next;  // start reversing from mid.next
        mid.next = null;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Merge two halves alternately
        Node left = head, right = prev;
        while (left != null && right != null) {
            Node nextL = left.next;
            Node nextR = right.next;

            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original:");
        printList(head);

        ZigZag();

        System.out.println("Zig-Zag:");
        printList(head);
    }
}
