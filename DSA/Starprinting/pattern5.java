package DSA.Starprinting;

import java.util.Scanner;

// a 
// A B 
// a b c 
// A B C D 
// a b c d e 

public class pattern5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % 2 == 0)
                        System.out.print((char) (j + 64) + " ");
                    else
                        System.out.print((char) (j + 96) + " ");
                }
                System.out.println();
            }
        }
    }
}
