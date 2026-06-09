package Day4;

public class Task4 {

    int rollNumber;
    String name;
    double marks;
    static int studentCount = 0;

    Task4() {
        rollNumber = 0;
        name = "unknown";
        marks = 0.0;
        studentCount++;
    }

    Task4(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        studentCount++;
    }

    public static void main(String[] args) {
        Task4 s1 = new Task4();
        Task4 s2 = new Task4(101, "Priya", 88.0);

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
