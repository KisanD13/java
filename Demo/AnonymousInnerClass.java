package Demo;

class AB {
    public void show() {
        System.out.println("show in AB");
    }
}

public class AnonymousInnerClass {
    static void main(String[] args) {
        AB obj = new AB() {
            public void show() {
                // this is basically an anonymous method of AB which is overriding the show method
                System.out.println("show in anonymous method");
            }
        };

        obj.show();
    }
}
