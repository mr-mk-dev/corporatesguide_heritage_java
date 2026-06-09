package Day4;

public class Task3 {

    int rollNumber;
    String name;
    double marks;
    static int studentCount = 0;

    Task3() {
        rollNumber = 0;
        name = "unknown";
        marks = 0.0;
        studentCount++;
    }

    public static void main(String[] args) {
        Task3 s = new Task3();
        System.out.println(s.rollNumber);
        System.out.println(s.name);
        System.out.println(s.marks);
    }
}
