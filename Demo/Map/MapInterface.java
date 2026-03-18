package Demo.Map;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("A", 10);
        students.put("B", 40);
        students.put("C", 30);
        students.put("D", 20);
        System.out.println(students); // {A=10, B=40, C=30, D=20}
        students.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println(students.get("A")); //10

        students.put("A", 50);
        System.out.println(students.get("A")); //50
        System.out.println(students);// {A=50, B=40, C=30, D=20} // that mean keys are always unique and if we put same key then it will replace previous one
        System.out.println(students.keySet()); //[A, B, C, D]
        System.out.println(students.values()); //[50, 40, 30, 20]

        for (String key : students.keySet()) {
            System.out.println(key + ": " + students.get(key));
        }
    }
}
