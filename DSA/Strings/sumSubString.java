package DSA.Strings;

import java.util.Scanner;

public class sumSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
                sum += Integer.parseInt(
                        str.substring(i, j));
            }
        }

        System.out.println();
        System.out.println("result " + sum);
        System.out.println(Integer.parseInt("sagar"));
        sc.close();
    }
}
