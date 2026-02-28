package DSA.OOP;

class Students {
    String name;
    double cgpa;
    private int role = 1112;

    void print() {
        System.out.println(name + " " + role + " " + cgpa);
    }

    //getter
    int getRole() {
        return role;
    }

    //setter
    void setRole(int x) {
        role = x;
    }
}

public class privateMethod {
    static void main(String[] args) {
//        Student s1 = new Student();
//        s1.name = "Sagar";
//        System.out.println(s1.name);

        Students s2 = new Students();
        s2.print();

        s2.name = "Sagar";
        s2.cgpa = 6.8;
        s2.print();

        System.out.println("role befor setter " + s2.getRole());

        s2.setRole(102);
        System.out.println("role befor setter " + s2.getRole());
    }
}
