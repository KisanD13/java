package DSA.LinkLIst;

import java.util.Scanner;

public class reversePrint {
    static void reversePrintHead(Node head) {
//        if (head == null) return;
//        reversePrintHead(head.next);
//        System.out.print(head.val + " ");

        if (head != null) {
            reversePrintHead(head.next);
            System.out.print(head.val + " ");
        }
    }

    static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Node head = new Node(sc.nextInt());
            Node w = new Node(33);
            Node x = new Node(123);
            Node y = new Node(13);
            Node z = new Node(12);
            head.next = w;
            w.next = x;
            x.next = y;
            y.next = z;

            reversePrintHead(head);
        }
    }
}
