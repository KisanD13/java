package DSA.Array;

import java.util.Arrays;

public class deepCopy {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 71, 6, 98 };

        int[] shalArr = arr;

        int[] deepArr = Arrays.copyOf(arr, arr.length);
        deepArr[3] = 56;

        int[] deepArr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            deepArr1[i] = arr[i];
        deepArr1[3] = 100;

        System.out.println(arr[3] + " " + shalArr[3] + " " + deepArr[3] + " " + deepArr1[3]);
    }
}
