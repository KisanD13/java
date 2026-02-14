package DSA.Starprinting;

import java.util.Scanner;

// *       * 
//   *   *   
//     *     
//   *   *   
// *       *    

public class square3 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            // int col = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {

                    if (n % 2 == 0 || n % 2 == 0)
                        System.out.print("Enter odd number ");
                    else if (j == i || j == n + 1 - i)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}
