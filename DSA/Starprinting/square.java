package DSA.Starprinting;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n) {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
