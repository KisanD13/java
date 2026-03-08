package DSA.LinkLIst;

//Given a singly linked list, delete the middle of the linked list.
//
//        Note:
//
//If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.
//If the input linked list has a single node, then it should return NULL.
public class gfg2 {
    static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(60);
        ll.addAtTail(70);
//        ll.addAtTail(80);
        ll.display();

        Node slow = ll.head;
        Node fast = ll.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.val = slow.next.val;
        slow.next = slow.next.next;
        System.out.println(slow.val);

        ll.display();
    }
}
