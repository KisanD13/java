package DSA.OOP;

public class polymorphism {
    public static class Dog {
        void speak() {
            System.out.println("Bhau");
        }
    }

    public static class Cat {
        void speak() {
            System.out.println("Meow");
        }
    }

    public static class Lion {
        void speak() {
            System.out.println("Roar");
        }
    }

    public static class Human {
        void speak() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();
        Human h = new Human();

        d.speak();
        c.speak();
        l.speak();
        h.speak();
    }
}
