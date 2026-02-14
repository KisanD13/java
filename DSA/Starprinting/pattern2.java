package DSA.Starprinting;

import java.util.Scanner;

// 111
// 222
// 333

public class pattern2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
