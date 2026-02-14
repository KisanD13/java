package DSA.Array;

import java.util.Scanner;

public class sumElem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner((System.in))) {
            System.out.print("Enter array size: ");
            int x = sc.nextInt();

            int sum = 0;

            int[] arr = new int[x];
            System.out.print("Enter array element: ");

            for (int i = 0; i < x; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < x; i++)
                sum += arr[i];
            System.out.println(sum);

            System.out.println();
        }
    }
}
