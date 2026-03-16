package Demo;

//class --- class  --> extends
//class --- interface --> implements
//interface --- interface  --> extends

interface AC {
    int age = 0; // all the variable inside the interface are final and static so we have initialized the value
    String area = "Bangalore"; // so we can use direct with AC.area or AC.age, without creating the object

    void show();

    void config(); // by default there are public abstract
}

interface AX {
    void run();
}

class ACB implements AC, AX {
    public void show() {
        System.out.println("show");
    }

    public void config() {
        System.out.println("config");
    }

    public void run() {
        System.out.println("Run");
    }
}

public class interfaces {
    //interface are not class
    static void main(String[] args) {
//        AC obj = new AC(); //cant instantiated or create the object for interface
        AC obj = new ACB();
        obj.show();
        obj.config();
        System.out.println(AC.age + " " + AC.area);

        AX obj1 = new ACB();
        obj1.run();
    }
}
