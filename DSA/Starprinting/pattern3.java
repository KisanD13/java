package DSA.Starprinting;

import java.util.Scanner;

// a a a a a a 
// B B B B B B 
// c c c c c c 
// D D D D D D 
// e e e e e e 
// F F F F F F 

public class pattern3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i % 2 == 0) {
                        System.out.print((char) (i + 64) + " ");
                    } else {
                        System.out.print((char) (i + 96) + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
