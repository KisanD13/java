package DSA.LinkLIst;

public class gfg3 {

    static int size(Node head) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    static void kthFromEnd(Node head, int k) {
        Node temp = head;
        int kthIndex = size(head) - k;
        System.out.println("kthFromEnd: " + kthIndex);

        for (int i = 1; i <= kthIndex; i++) {
            temp = temp.next;
        }

        System.out.println("kth node value " + temp.val);
    }

    static int kthFromEnd2(Node slow, Node fast, int k) {
        for (int i = 1; i <= k; i++) {
            if (fast == null) return -1;
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println("kth node value " + slow.val);
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

        kthFromEnd(ll.head, 2); // normal solution

//        two pointer one pass solution
        Node slow = ll.head;
        Node fast = ll.head;
        kthFromEnd2(slow, fast, 2);

    }
}
