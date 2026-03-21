package Demo;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class InheritClass {


    static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
//        animal.bark(); this one giving compile error because object is created of Dog but referring to Animal and Animal doesn't have "bark" method

        Dog dog = new Dog();
        dog.eat();
        dog.bark(); // Dog has both method it also inherits Animal
    }
}
