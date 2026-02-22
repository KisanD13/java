package DSA.Strings;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "Kishan";
        String s2 = "ikhsan";

        if (s1.length() != s2.length())
            System.out.println("Not Anagram");

        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        for (int i = 0; i < s2Arr.length; i++) {
            if (s1Arr[i] == s2Arr[i])
                System.out.println("not anagram");
            else
                System.out.println("its anagram");
        }
    }
}
