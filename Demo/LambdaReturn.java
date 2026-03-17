package Demo;

@FunctionalInterface
interface XY {
    int add(int a, int b);
}

public class LambdaReturn {
    static void main(String[] args) {
        XY obj = new XY() {
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(obj.add(10, 20));

        XY obj1 = (a, b) -> {
            return a + b;
        };
        System.out.println(obj1.add(11, 22));
    }
}
