package DSA.Strings;

public class reserveSb {
    public static void main(String[] args) {
        String s = "Kishan";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(s + " " + sb);

        int i = 0, j = sb.length();
        while (i < j) {
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j - 1);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j - 1, temp1);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
