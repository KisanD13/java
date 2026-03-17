package Demo;

abstract class ABC {
    public abstract void show();
}

public class AbstractAnonymousInnerClass {
    static void main(String[] args) {
        ABC obj = new ABC() {
            public void show() {
                System.out.println("show in anonymous but outside abstract method");
            }
        };
        obj.show();

        ABC obj1 = new ABC() {
            public void show() {
                System.out.println("show in anonymous but outside abstract method");
            }
        };
        obj1.show();
    }
}
