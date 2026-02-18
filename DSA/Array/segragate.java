package DSA.Array;

public class segragate {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0 };

        int noOfZeros = 0;
        int noOfOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                noOfZeros++;
            else
                noOfOnes++;
        }

        System.out.print(noOfZeros + " " + noOfOnes);
        System.out.println();

        for (int i = 0; i < noOfZeros; i++)
            arr[i] = 0;

        // for (int ele : arr)
        // System.out.print(ele + " ");

        for (int j = noOfZeros; j < noOfZeros + noOfOnes; j++)
            arr[j] = 1;

        for (int ele : arr)
            System.out.print(ele + " ");

        System.out.println();
    }
}
