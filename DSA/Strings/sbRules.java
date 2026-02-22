package DSA.Strings;

public class sbRules {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("SagarDas");

        sb.deleteCharAt(1);// SgarDas
        System.out.println(sb);

        sb.insert(1, "a");// SagarDas
        System.out.println(sb);

        sb.delete(5, 8);// Sagar
        System.out.println(sb);
        System.out.println(sb);

        sb.delete(5, 8);// Sagar
        System.out.println(sb);
    }
}
