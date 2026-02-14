package DSA.Array;

import java.util.Scanner;

public class outputInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] arr = { 2, 3, 6, 7, 8, 5, 10 };
        // // System.out.println(arr.length);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        System.out.println();

        int[] arr1 = new int[7];

        // for (int i = 0; i < 7; i++) {
        // System.out.print(arr1[i] + " ");
        // }

        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            System.out.print(arr1[i] * 2 + " ");
        }

        System.out.println();
        sc.close();
    }
}
