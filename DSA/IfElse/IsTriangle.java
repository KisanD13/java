package DSA.IfElse;

import java.util.Scanner;

//Take three integer input and tell if they can be  the sides of the triangle

public class IsTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter side a: ");
            int a = sc.nextInt();

            System.out.print("Enter side b: ");
            int b = sc.nextInt();

            System.out.print("Enter side c: ");
            int c = sc.nextInt();

            if (a + b > c && b + c > a && c + a > b)
                System.out.println("they are sides of a triangle");
            else
                System.out.println("they are sides of a triangle");
        }
    }
}
