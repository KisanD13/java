package DSA.Array;

import java.util.Scanner;

public class printNegative {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner((System.in))) {
            System.out.print("Enter array size: ");
            int x = sc.nextInt();

            int[] arr = new int[x];
            System.out.print("Enter array element: ");

            for (int i = 0; i < x; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] < 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
