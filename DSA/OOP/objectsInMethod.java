package DSA.OOP;

public class objectsInMethod {
    public static class Car {
        int seats;
        String name;
        double length;
        String type;
        int torque;

        // method inside classs
        void print() {
            System.out.println(seats + " " + name + " " + length + "m " + type + " " + torque);
        }

    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.length = 3.99;
        c1.name = "Kia Sonnet";
        c1.seats = 5;
        c1.torque = 178;
        c1.type = "SUV";

        Car c2 = new Car();
        c2.length = 4.99;
        c2.name = "Verna";
        c2.seats = 4;
        c2.torque = 148;
        c2.type = "Sedan";

        change(c1);
        System.out.println(c1.seats); // becasue the answer is 4 that means it changes the reference

        c1.print();
        c2.print();
    }

    private static void change(Car c) {
        c.seats = 4;
    }

}
