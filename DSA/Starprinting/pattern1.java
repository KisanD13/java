package DSA.Starprinting;

import java.util.Scanner;

// 1234
// 1234
// 1234
// 1234

public class pattern1 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
