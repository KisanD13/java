package DSA.OOP;

import java.util.Scanner;

class Student {
    // Studen basically is type of own
    String name;
    int role;
    double cgpa;
}

public class UserDefinedDatatype {
    // public static class Student {
    //     // Studen basically is type of own
    //     String name;
    //     int role;
    //     double cgpa;
    // }

    public static void main(String[] args) {

        // Scanner is basically class
        // sc is object
        try (Scanner sc = new Scanner(System.in)) {
            Student s1 = new Student(); // declaration
            s1.cgpa = 6.8;
            s1.name = "Kishan";
            s1.role = 112;

            System.out.println(s1.name);

            // System.out.println(s1.cgpa); // 6.8

            // s1.cgpa = 7;
            // System.out.println(s1.cgpa); // 7.0

            Student s2 = new Student(); // declaration
            s2.cgpa = 6.8;
            s2.name = "Kishan";
            s2.role = sc.nextInt();
            // System.out.println(s2.role);
        }
    }
}
