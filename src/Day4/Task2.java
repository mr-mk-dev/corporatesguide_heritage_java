package Day4;

public class Task2 {

    int rollNumber;
    String name;
    double marks;
    static int studentCount = 0;

    Task2() {
        studentCount++;
    }

    public static void main(String[] args) {
        Task2 s1 = new Task2();
        Task2 s2 = new Task2();
        Task2 s3 = new Task2();

        System.out.println("total students: " + Task2.studentCount);
    }
}
