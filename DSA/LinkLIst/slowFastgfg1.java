package DSA.LinkLIst;

public class slowFastgfg1 {

    static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(60);
        ll.addAtTail(70);
        ll.addAtTail(80);
        ll.display();

        Node slow = ll.head;
        Node fast = ll.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.val);
    }
}
