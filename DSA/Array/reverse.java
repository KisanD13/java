package DSA.Array;

/// two pointer/two variable

public class reverse {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, -1, 7, -5, 234, 45, 56 };

        // int i = 0;
        // int j = arr.length - 1;

        // while (i < j) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // i++;
        // j--;
        // }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int ele : arr)
            System.out.print(ele + " ");

        System.out.println();
    }
}
