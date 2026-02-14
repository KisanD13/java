package DSA.IfElse;

import java.util.Scanner;

//Take positive integer and print:
//if number is divisible by 5
//if number is divisible by 3
//if number is divisible by 5 & 3 both
//if number is not divisible by 5 & 3 both

public class Isdivisible {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the input: ");
            int i = sc.nextInt();

            if (i % 5 == 0 && i % 3 == 0)
                System.out.println(i + " is divisible by both 5 & 3");
            else if (i % 5 == 0)
                System.out.println(i + " is divisible by 5");
            else if (i % 3 == 0)
                System.out.println(i + " is divisible by 3");
            else
                System.out.println(i + " is not divisible by both 5 & 3");
        }
    }
}
