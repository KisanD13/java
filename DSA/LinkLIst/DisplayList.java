package DSA.LinkLIst;

//traverse entire list only with head

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}


public class DisplayList {

    public static void display(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.val + " -> ");
//            temp = temp.next;
//        }
        
        //recursive
        if (head != null) {
            System.out.print(head.val + " -> ");
            display(head.next);
        }

//        for (Node temp = head; temp != null; temp = temp.next) {
//            System.out.print(temp.val + " -> ");
//        }

        System.out.println();
    }

    static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(400);
        Node e = new Node(500);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
    }
}
