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
    int size;

    void display() {
        if (head == null) return;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    boolean search(int val) {
        if (head == null) return false;

        Node temp = head;
        while (temp != null) {
            if (temp.val == val) return true;
            temp = temp.next;
        }
        return false;
    }

    int search1(int val) {
        if (head == null) return -1;

        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    void addAtHead(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        temp.next = head;
        head = temp;
        size++;
    }

    void addAtMiddle(int idx, int val) {
        if (idx < 0 || idx >= size) {
            System.out.println("Index out of range");
        } else if (idx == 0) addAtHead(val);
        else if (idx == size) addAtTail(val);
        else {
            Node temp = head;
            Node newNode = new Node(val);

            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    void deleteAtMiddle(int idx) {
        Node temp = head;

        if (idx < 0 || idx >= size) {
            System.out.println("Index out of range");
        } else if (idx == 0) {
            deleteAtHead();
        } else {
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            if (idx == size - 1) tail = temp;

            size--;
        }
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

        System.out.println(ll.search(10));
        System.out.println(ll.search1(90));
    }
}
