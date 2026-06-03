package Day1;

public class Task9 {
    public static void main(String[] args) {

        String name = "Manish Kumar";
        double salary = 75000.99;
        String department = "Software Development";
        boolean active = true;

        String performance = salary >= 70000 ? "Excellent" : "Needs Improvement";

        String summary = "Employee: " + name +
                " | Department: " + department +
                " | Salary: ₹" + salary +
                " | Active: " + active +
                " | Performance: " + performance;
        System.out.println(summary);
    }
}
