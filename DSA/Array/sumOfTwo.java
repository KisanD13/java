package DSA.Array;

// Given an array arr[]of integers and another integer target.Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

public class sumOfTwo {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, -1, 7, -5 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 2) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
