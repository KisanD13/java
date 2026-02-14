package DSA.Starprinting;

import java.util.Scanner;

// A 
// A B 
// A B C 
// A B C D

public class pattern4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print((char) (j + 96) + " ");
                }
                System.out.println();
            }
        }
    }
}
