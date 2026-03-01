package DSA.Methods;

public class marks {

    public static class StudentData {
        String name;
        int rno;
        int[] marks;

        StudentData(int s) {
            marks = new int[s];
        }

        StudentData(int[] sArr) {
            marks = sArr;
        }
    }

    static void main() {
        StudentData s1 = new StudentData(4);
        StudentData s2 = new StudentData(3);

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        StudentData s3 = new StudentData(arr);

        System.out.println(s1);
    }
}
