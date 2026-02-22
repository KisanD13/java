package DSA.Strings;

public class stringArr {
    public static void main(String[] args) {
        String str = "Sagar das";
        char[] ch = str.toCharArray();
        System.out.println(ch);

        String name = "Kishan";
        name = name.substring(0, 6) + " Das";

        System.out.println(name);
    }
}
