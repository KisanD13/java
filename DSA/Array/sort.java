package DSA.Array;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 71, 6, 98 };

        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
