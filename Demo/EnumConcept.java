package Demo;

enum Laptops {
    Macbook(2000), XPS(2200), Surface(1500), Thinkpad;

    private int price;

    Laptops() {
        this.price = 3000;
    }

    Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

enum Status {
    Success, Running, Pending, Failed
}

public class EnumConcept {
    static void main(String[] args) {
//        Status s = Status.Success;
//        switch (s) {
//            case Running:
//                System.out.println("All good");
//                break;
//            case Failed:
//                System.out.println("Try again");
//                break;
//            case Pending:
//                System.out.println("Please wait");
//                break;
//            default:
//                System.out.println("All done");
//                break;
//        }
//        Status[] ss = Status.values();
//        for (Status sss : ss) {
//            System.out.println(sss + " " + sss.ordinal());
//        }

//        Laptops lap = Laptops.Macbook;
//        System.out.println(lap + ": " + lap.getPrice());

        for (Laptops laps : Laptops.values()) {
            System.out.println(laps + ": " + laps.getPrice());
        }
    }
}
