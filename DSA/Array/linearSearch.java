package DSA.Array;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int[] arr = { 2, 4, 8, 71, 7, 98 };

            System.out.print("Enyter the target: ");
            int target = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Target exists in array");
            } else {
                System.out.println("Target does not exist in array");
            }
        }
    }
}
