package DSA.Methods;

public class ReturnType {
    public static int number() {
        System.out.println("Hello");
        return 5;
    }

    public static void main(String[] args) {
        int x = number();
        System.out.println(x);
    }
}