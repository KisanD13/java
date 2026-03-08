package DSA.LinkLIst;

//You are given the head of a linked list, You have to return the value of the middle node of the linked list.
//
//If the number of nodes is odd, return the middle node value.
//If the number of nodes is even, there are two middle nodes, so return the second middle node value.


public class gfg1 {

    static int size(Node head) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
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

        System.out.println(size(ll.head));
        int middle = size(ll.head) / 2;
        System.out.println(middle + " and heade node value is  " + ll.head.val);

        Node middleNode = ll.head;
        for (int i = 1; i <= middle; i++) {
            middleNode = middleNode.next;
        }

        System.out.println(middleNode.val);
    }
}
