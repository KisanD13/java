package DSA.Strings;

public class changeTheString {
    static String modify(String str) {
        return Character.isUpperCase(str.charAt(0))
                ? str.toUpperCase()
                : str.toLowerCase();
    }

    public static void main(String[] args) {
        modify("Sagar");
        // System.out.println(modify("Sagar"));
        String s = "" + 0012345667;
        System.out.println(s);

    }
}
