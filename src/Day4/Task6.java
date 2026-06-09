package Day4;

public class Task6 {

    int rollNumber;
    String name;
    double marks;
    static int studentCount = 0;

    Task6() {
        rollNumber = 0;
        name = "unknown";
        marks = 0.0;
        studentCount++;
    }

    Task6(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        studentCount++;
    }

    void display() {
        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("roll: " + rollNumber);
        System.out.println("name: " + name);
        System.out.println("marks: " + marks);
        System.out.println("grade: " + grade);
        System.out.println("---");
    }

    public static void main(String[] args) {
        Task6 s1 = new Task6(101, "Ravi", 92.0);
        Task6 s2 = new Task6(102, "Priya", 76.5);
        Task6 s3 = new Task6(103, "Amit", 45.0);

        s1.display();
        s2.display();
        s3.display();
    }
}
