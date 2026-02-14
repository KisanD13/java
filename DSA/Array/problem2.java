package DSA.Array;

//multiply odd  elements by 2 and add 10 to even elements

public class problem2 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 71, 7, 98 };

        solution(arr);
    }

    public static void solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                arr[i] += 10;
            else
                arr[i] *= 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
