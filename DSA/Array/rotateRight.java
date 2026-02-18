package DSA.Array;

public class rotateRight {
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
        int r = 3;
        int n = arr.length - 1;
        r = r % arr.length;

        reverse(arr, 0, n);
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();

        reverse(arr, 0, r - 1);
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();

        reverse(arr, r, n);
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }
}
