package DSA.LinkLIst;

class Node { //user defined data type
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class LinkedList {
    Node head; // null
    Node tail; // null

    void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
    }

    void display() {
        if (head == null) return;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
    }

    void addAtMiddle(int idx, int val) {
        Node temp = new Node(val);
        Node valatIndex = null;
        Node valatNextIndex = null;

        for (int i = 1; i <= idx; i++) {
            valatIndex = head.next;
            valatNextIndex = valatIndex.next;
        }

        valatIndex.next = temp;
        temp.next = valatNextIndex;

    }

    void deleteAtHead() {
        head = head.next;
    }

    void deleteAtMiddle(int idx) {
        Node valAtIndex = head;

        for (int i = 1; i < idx - 1; i++) {
            valAtIndex = head.next;
        }

        valAtIndex.next = valAtIndex.next.next;
    }
}

public class LinkedListClass {

    static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.display();

        ll.addAtTail(20);
        ll.display();

        ll.addAtTail(30);
        ll.display();

        ll.addAtHead(1);
        ll.display();

        ll.addAtMiddle(2, 80);
        ll.display();

        ll.deleteAtMiddle(3);
        ll.display();

        ll.deleteAtHead();
        ll.display();
    }
}
