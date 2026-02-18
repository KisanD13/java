package DSA.Array;

public class rotateArray1 {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, -1, 7, -5, 234, 45, 56 };
        int i = 0;
        int r = 3;
        int n = arr.length - 1;

        reverse(arr, i, n);
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();

        reverse(arr, n - r + 1, n);
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();

        reverse(arr, i, n - r);
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }
}
