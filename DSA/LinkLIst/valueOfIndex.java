package DSA.LinkLIst;

import java.util.Scanner;

public class valueOfIndex {
    static int getInex(Node head, int idx) {
//        for (int i = 1; i <= idx; i++) {
//            head = head.next;
//        }

        int i = 0;
        while (i != idx && head != null) {
            head = head.next;
            i++;
        }

        return head.val;
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

//            getInex(head, 2);
            System.out.println(getInex(head, 5));
        }
    }
}
