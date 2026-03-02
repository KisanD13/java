package DSA.OOP;

class Cricketer {
    final String country = "India";
    static String council = "ICC"; // static basically means shareable variable
    int runs;
    int age;
    double average;
}

public class FinalAndStatic {

    static void main(String[] args) {
        Cricketer c1 = new Cricketer();
//        c1.country = "Eng"; gives error of cannot assign value to final
        System.out.println(Cricketer.council);

        Cricketer c2 = new Cricketer();
        Cricketer.council = "BCCI"; // even though shareable variable we can still change for different instance
        System.out.println(Cricketer.council);
    }
}
