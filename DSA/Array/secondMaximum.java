package DSA.Array;

public class secondMaximum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, -1, 7, -5 };

        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        // calculate max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        // calculate secondmax
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secmax && arr[i] != max)
                secmax = arr[i];
        }

        System.out.println(secmax);
    }
}
