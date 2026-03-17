package DSA.LinkLIst;

//You are given the head of a singly linked list. You have to determine whether the given linked list contains a loop or not.
//A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.

public class gfg5 {
    static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(60);
        ll.addAtTail(70);
        ll.addAtTail(80);
        ll.display();
    }
}
