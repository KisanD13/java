package Demo;

// TODO: Create an interface called Machine with one method: String start()
interface Machine {
    String start();
}

// TODO: Create an abstract class called Appliance that:
// - Implements Machine interface
abstract class Appliance implements Machine {
    String name;

    Appliance(String name) {
        this.name = name;
    }
}

// TODO: Create a class Fan that:
// - Extends Appliance
class Fan extends Appliance {
    Fan(String name) {
        super(name);
    }

    public String start() {
        return name + " is running";
    }

}

// TODO: Create a class WashingMachine that:
// - Extends Appliance
class WashingMachine extends Appliance {
    WashingMachine(String name) {
        super(name);
    }

    public String start() {
        return name + " is operating";
    }

}


public class exercise {
    static void main(String[] args) {
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("Washing Machine");
        System.out.println(fan.start());
        System.out.println(washer.start());
    }
}
