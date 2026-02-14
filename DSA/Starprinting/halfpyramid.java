package DSA.Starprinting;

import java.util.Scanner;

// *
// * *
// * * *

public class halfpyramid {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            // int col = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
