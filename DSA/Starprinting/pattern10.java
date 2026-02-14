package DSA.Starprinting;

import java.util.Scanner;

// 54321
// 5432
// 543
// 54
// 5

public class pattern10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n + 1 - i; j++) {
                    System.out.print((char) (j + 96) + " ");
                }
                System.out.println();
            }
        }
    }
}
