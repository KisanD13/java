package DSA.LinkLIst;

//You are given the head of a linked list, and an integer k.
//
//Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

public class leetcode2 {

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
        Node temp = ll.head;
        int k = 2;

        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println(temp.val);
        System.out.println(slow.val);
        int temp1 = temp.val;
        temp.val = slow.val;
        slow.val = temp1;

        ll.display();

    }
}
