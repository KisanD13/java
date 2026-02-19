package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class basics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(10);
        arr.add(19);
        arr.add(0);
        arr.add(0);

        System.out.println(arr);
        System.out.println(arr.get(2));
        arr.set(3, 50);
        arr.set(4, 52);
        arr.set(4, null);

        System.out.println(arr);
        int n = arr.size();
        System.out.println("length " + n);
        for (Integer ele : arr)
            System.out.print(ele + " ");

        System.out.println();

        arr.add(66);
        System.out.println("check now: " + arr + " size " + arr.size());

        arr.add(1, 78);
        System.out.println("final output: " + arr + " size " + arr.size());

        arr.remove(arr.size() - 1);
        System.out.println("final output: " + arr + " size " + arr.size());

        Collections.reverse(arr);
        System.out.println("final output: " + arr + " size " + arr.size());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(15);
        arr1.add(110);
        arr1.add(1);
        arr1.add(2);
        arr1.add(40);
        System.out.println("Arr1: " + arr1 + " size " + arr1.size());

        int i = 0;
        int j = arr1.size() - 1;

        while (i < j) {
            int temp = arr1.get(i);
            arr1.set(i, arr1.get(j));
            arr1.set(j, temp);
            i++;
            j--;
        }

        System.out.println("reverse arr: " + arr1 + " size " + arr1.size());

    }
}
