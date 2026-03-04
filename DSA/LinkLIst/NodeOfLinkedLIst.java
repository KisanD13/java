package DSA.LinkLIst;

// limitations of arrays are basically of fixed size, continuous memory location, hard to add/delete elements from middle

public class NodeOfLinkedLIst {

    static void main(String[] args) {
        Node a = new Node(10);
//        a.val = 10; instead of assigning value like we will  create constructor and pass value

        Node b = new Node(20);
//        b.val = 20;

        Node c = new Node(30);
//        c.val = 30;

        Node d = new Node(40);
//        d.val = 40;

        Node e = new Node(50);
//        e.val = 50;

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a); //DSA.LinkLIst.Node@10f87f48

        System.out.println(b); //DSA.LinkLIst.Node@b4c966a
        System.out.println(a.next); //DSA.LinkLIst.Node@b4c966a , this b's reference is stored in a's next

        System.out.println(c); //DSA.LinkLIst.Node@2f4d3709
        System.out.println(b.next); //DSA.LinkLIst.Node@2f4d3709 , this means c's reference is stored in b's next
        System.out.println(a.next.next); //DSA.LinkLIst.Node@2f4d3709

    }
}
