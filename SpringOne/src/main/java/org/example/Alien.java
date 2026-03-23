package org.example;

public class Alien {
    private int age;
    Alien(){
        System.out.println("Object created");
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        System.out.println("setter called....");
        this.age = age;
    }

    public void code(){
        System.out.println("coding....");
    }
}
