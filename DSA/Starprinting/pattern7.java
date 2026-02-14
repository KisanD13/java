package DSA.Starprinting;

import java.util.Scanner;

// * * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

public class pattern7 {
    public static void main(String[] args) {
        // try (Scanner sc = new Scanner(System.in)) {
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // }

        // also

        // try (Scanner sc = new Scanner(System.in)) {
        // int n = sc.nextInt();

        // int a = n;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= a; j++) {
        // System.out.print("* ");
        // }
        // a--;
        // System.out.println();
        // }
        // }

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n + 1 - i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
