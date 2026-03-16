package Demo;

class A {
    int age;

    public void show() {
    }

    class B {
        public void config() {
            System.out.println("config");
        }
    }

    static class C {
        public void configAgain() {
            System.out.println("config again");
        }
    }
}

public class InnerClass {
    static void main(String[] args) {
        A obj = new A();
        A.B obj1 = obj.new B(); // for a non-static inner class, i have to create  from the instance of the parent
        obj1.config();

        A.C obj2 = new A.C(); // for a static inner class I can directly create with A.C
    }
}
