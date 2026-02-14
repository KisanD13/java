package DSA.Array;

public class minElem {
    public static void main(String[] args) {
        int[] x = { 2, 34, 58, 20, 78, 90, 0, 19 };

        int min = x[0];

        for (int i = 0; i < x.length; i++)
            min = (x[i] < min) ? x[i] : min;

        System.out.println(min);
    }
}
