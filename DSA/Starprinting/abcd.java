package DSA.Starprinting;

import java.util.Scanner;

// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 

public class abcd {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print((char) (j + 64) + " ");
                }
                System.out.println();
            }
        }
    }
}
