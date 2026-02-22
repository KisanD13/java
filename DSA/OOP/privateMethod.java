package DSA.OOP;

class Students {
    String name;
    private int role = 1112;
    double cgpa;

    void print() {
        System.out.println(name + " " + role + " " + cgpa);
    }
}

public class privateMethod {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sagar";
        System.out.println(s1.name);
        // Students s1 = new Students();
        // s1.print();

        // s1.name = "Sagar";
        // s1.cgpa = 6.8;

        // s1.print();
    }
}
