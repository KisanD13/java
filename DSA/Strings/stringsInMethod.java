package DSA.Strings;

public class stringsInMethod {
    public static void change(String s) {
        s = "Kishan";
        System.out.println(s);
    }

    public static void main(String[] args) {
        String x = "Sagar";
        System.out.println(x);

        change(x);
        System.out.println(x);
    }
}
