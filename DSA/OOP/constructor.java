package DSA.OOP;

public class constructor {

    public static class Car {
        int seats;
        String name;
        double length;

        Car() { //this is default constructor work as new Car()
        }

        Car(int seats, String name, double l) {
            //now instead of assiging manually like c1.seats, c1.name we can directly pass as argument
            this.seats = seats;
            this.name = name;
            length = l;
        }

        Car(String name, double l, int seats) {
            //now instead of assiging manually like c1.seats, c1.name we can directly pass as argument
            this.seats = seats;
            this.name = name;
            length = l;
        }

        void print() {
            int seats = 2;
            System.out.println("name " + name + " This Seats " + this.seats + " Seats " + seats + " length " + length + "m");
        }
    }

    static void main() {
        Car c1 = new Car(6, "Harrier", 5.5);
        c1.print();

        Car c2 = new Car(4, "Elentra", 6.0);
        c2.print();

        Car c3 = new Car("Elentra", 6.0, 4);
        c2.print();

        Car c4 = new Car();

    }

}
