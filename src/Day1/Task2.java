package Day1;

public class Task2 {
    public static void main(String[] args) {
        String empName = "Manish";
        String department = "Software Development";
        String email = "manish825316@gmail.com";

        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);

        String val1 = new String("manish");
        String val2 = new String("manish");

        System.out.println("Using == : " + val1==val2);
        System.out.println("Using .equals : " + val1.equals(val2));
    }
}
