package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private int weight;
    private Computer computer;
//    private Laptop laptop;
    public Alien(){
        System.out.println("Object created");
    }

//    @ConstructorProperties({"age", "weight", "laptop"}) // if we mention with constructor properties annotation then it doesn't check the sequence other it cheks annotation,
//    public Alien(int age,  int weight,  Laptop laptop){
//        System.out.println("Constructor Object created");
//        this.age = age;
//        this.laptop = laptop;
//        this.weight = weight;
//    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        System.out.println("setter called....");
        this.age = age;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        System.out.println("coding....");
        computer.compile();
    }
}
