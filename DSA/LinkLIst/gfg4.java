package DSA.LinkLIst;

//Given the head of a linked list, remove the nth node from the end of the list and return its head.

public class gfg4 {

    static int deletekthFromEnd(Node slow, Node fast, int k) {
        for (int i = 1; i <= k; i++) {
            if (fast == null) return -1;
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.val = slow.next.val;
        slow.next = slow.next.next;
        return slow.val;
    }

    static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(60);
        ll.addAtTail(70);
        ll.addAtTail(80);
        ll.display();

//        two pointer one pass solution
//        Node slow = ll.head;
//        Node fast = ll.head;
//        deletekthFromEnd(slow, fast, 2);
//        ll.display();

        Node head = ll.head;
        Node temp = head;
        Node removableNode = head;
        int size = 0;
        int n = 2;

        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next;
        }
        for (int i = 1; i < size - n; i++) {
            removableNode = removableNode.next;
        }
        removableNode.next = removableNode.next.next;
        ll.display();

    }
}
