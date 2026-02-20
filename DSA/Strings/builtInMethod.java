package DSA.Strings;

public class builtInMethod {
    public static void main(String[] args) {
        String str = "Sagar Das";

        // System.out.println(str.indexOf('a'));
        // System.out.println(str.lastIndexOf('a'));
        // System.out.println(str.toCharArray());
        // System.out.println(str.toLowerCase());

        // index of first char
        // int first = str.indexOf('a');

        // int second = str.indexOf(('a'), first + 1);
        // System.out.println(second);

        // index of all char
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                System.out.println(i);
            }
        }
    }
}
