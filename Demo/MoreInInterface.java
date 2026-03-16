package Demo;

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code in laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code in desktop");
    }
}

class Developer {
    public void devApp(Computer c) {
        c.code();
    }
}

public class MoreInInterface {
    static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer sagar = new Developer();
        sagar.devApp(lap);
    }
}
