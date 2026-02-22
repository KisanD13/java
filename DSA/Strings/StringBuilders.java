package DSA.Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Sagar");
        System.out.println(str.capacity()); /// 16

        System.out.println(str.append("Bro")); // KishanBro

        str.setCharAt(3, 'o');
        System.out.println(str);

        str.charAt(3);
        System.out.println(str);
    }
}
