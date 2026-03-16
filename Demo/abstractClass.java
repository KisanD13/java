package Demo;

abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Play music");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("Driving");
    }
}

public class abstractClass {
    static void main(String[] args) {
        //cannot create the instance or object of abstract class but reference of the object we can create
        Car obj = new WagonR();
        obj.playMusic();
        obj.drive();
    }
}
