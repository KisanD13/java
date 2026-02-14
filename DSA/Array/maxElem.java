package DSA.Array;

public class maxElem {
    public static void main(String[] args) {
        int[] x = { 2, 34, 58, 20, 78, 90, 0, 19 };

        int max = x[0];

        for (int i = 0; i < x.length; i++)
            max = (x[i] > max) ? x[i] : max;

        System.out.println(max);

        System.out.println();
    }
}
