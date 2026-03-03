package DSA.OOP;

class ComplexNumberClass {
    int x;
    int y;

    ComplexNumberClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        if (y > 0) System.out.println(x + " + " + y + "i");
        else if (y < 0) System.out.println(x + " - " + (-y) + "i");
        else System.out.println(x);
    }

    void add(ComplexNumberClass z) {
        x += z.x;
    }

    void multiply(ComplexNumberClass z) {

    }
}

public class ComplexNumber {

    static void main(String[] args) {
        ComplexNumberClass c1 = new ComplexNumberClass(10, 20);
        ComplexNumberClass c2 = new ComplexNumberClass(10, -30);
        ComplexNumberClass c3 = new ComplexNumberClass(10, 0);
        c1.print();
        c2.print();
        c3.print();

        c1.add(c2);
        c2.print();
    }
}
