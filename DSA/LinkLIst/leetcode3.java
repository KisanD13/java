package DSA.LinkLIst;
//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all,
// return null.


public class leetcode3 {
    static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(60);
        ll.addAtTail(70);
        ll.addAtTail(80);

        System.out.print("List A: ");
        ll.display();


        LinkedList ll1 = new LinkedList();
        ll1.addAtTail(1);
        ll1.addAtTail(3);
        ll1.addAtTail(4);

        // find node 40 in first list
        Node temp = ll.head;
        while (temp != null) {
            if (temp.val == 40) {
                break;
            }
            temp = temp.next;
        }

        // connect list2 to node 40
        ll1.tail.next = temp;

        System.out.print("List B: ");
        ll1.display();
    }
}
