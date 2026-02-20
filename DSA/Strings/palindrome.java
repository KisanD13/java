package DSA.Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int i = 0;
            int j = s.length() - 1;
            boolean isPalindrome = true;

            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }

            if (isPalindrome)
                System.out.println(s + " is palindrome");
            else
                System.out.println(s + " is NOT palindrome");

            while (i < j && s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }

            if (i >= j)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }
}
