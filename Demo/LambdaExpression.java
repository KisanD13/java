package Demo;

@FunctionalInterface
interface X {
    void show(String name);
}

public class LambdaExpression {
    static void main(String[] args) {
        X obj = new X() {
            public void show(String name) {
                System.out.println("show in obj " + name);
            }
        };
        obj.show("Kishan");


        X obj1 = (name) -> { // this arrow mark is lamda expression
            System.out.println("show in obj1 " + name);
        };
        obj1.show("Sagar");
    }
}
