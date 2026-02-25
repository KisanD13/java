package DSA.Array;

// You are given an array arr[]of size n-1 that contains distinct integers in the range from 1 to n(inclusive).This array represents a permutation of the integers from 1 to n with one element missing.Your task is to identify and return the missing element.

public class missingInteger {

    public static int findMissing(int[] arr, int n) {
        int total = n * (n + 1) / 2; // sum of 1..n
        int arrSum = 0;
        for (int num : arr)
            arrSum += num;
        return total - arrSum; // missing number
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        int n = 5;

        System.out.println(findMissing(arr, n));
    }
}
