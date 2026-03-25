package org.example;

public class Laptop implements Computer {
    Laptop() {
        System.out.println("Laptop constructor");
    }

    @Override
    public void compile(){
        System.out.println("Laptop compile");
    }
}
