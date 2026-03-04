package DSA.OOP;

public class RevisionInOop {
    private static class Pokemon {
        int power;
        String type;
        String name;

        Pokemon() {
        }

        Pokemon(String name, int power) {
            this.name = name;
            this.power = power;
        }

        void print() {
            System.out.println(this.power + "hp " + this.type + " " + this.name);
        }
    }

    static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        System.out.println(p1);

        Pokemon p2 = new Pokemon("KingK", 4000);
        p2.type = "BS4";
        p2.print();

        final int x = 10; // final basically means it fixes the value
        System.out.println(x);

    }
}
