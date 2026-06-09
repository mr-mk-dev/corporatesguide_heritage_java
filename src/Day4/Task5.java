package Day4;

public class Task5 {

    int rollNumber;
    String name;
    double marks;
    static int studentCount = 0;

    Task5() {
        rollNumber = 0;
        name = "unknown";
        marks = 0.0;
        studentCount++;
    }

    Task5(int rollNumber, String name, double marks) {
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
    }

    public static void main(String[] args) {
        Task5 s = new Task5(102, "Amit", 91.0);
        s.display();
    }
}
