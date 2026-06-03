package Day1;

public class Task10 {

    public static void main(String[] args) {

        String empCode1 = "EMP-IT-1001";
        String name1 = "Manish Kumar";
        double salary1 = 75000.99;
        boolean active1 = true;

        String empCode2 = "EMP-HR-1002";
        String name2 = "Rahul Sharma";
        double salary2 = 52000.75;
        boolean active2 = true;

        String empCode3 = "EMP-FIN-1003";
        String name3 = "Priya Singh";
        double salary3 = 68000.50;
        boolean active3 = false;

        String empCode4 = "EMP-MKT-1004";
        String name4 = "Amit Das";
        double salary4 = 45000.25;
        boolean active4 = true;

        String empCode5 = "EMP-OPS-1005";
        String name5 = "Neha Verma";
        double salary5 = 85000.80;
        boolean active5 = true;

        int roundedSalary1 = (int) salary1;
        int roundedSalary5 = (int) salary5;

        long longSalary1 = roundedSalary1;
        long longSalary5 = roundedSalary5;


        System.out.println("\nCORPORATE EMPLOYEE SUMMARY REPORT\n");

        printEmployee(empCode1, name1, longSalary1, active1);
        printEmployee(empCode2, name2, (long) salary2, active2);
        printEmployee(empCode3, name3, (long) salary3, active3);
        printEmployee(empCode4, name4, (long) salary4, active4);
        printEmployee(empCode5, name5, longSalary5, active5);

        System.out.println("\n\n");
    }

    public static void printEmployee(
            String empCode,
            String name,
            long salary,
            boolean active) {

        String department = empCode.substring(4, empCode.indexOf('-', 4));

        String upperName = name.toUpperCase();

        char firstLetter = name.charAt(0);

        boolean validCode = empCode.startsWith("EMP");

        String performance =
                salary >= 70000 ? "EXCELLENT" : "GOOD";

        String status =
                active ? "ACTIVE" : "INACTIVE";

        System.out.println(
                "Code: " + empCode +
                        " | Name: " + upperName +
                        " | Dept: " + department +
                        " | First Letter: " + firstLetter +
                        " | Salary: ₹" + salary +
                        " | Status: " + status +
                        " | Performance: " + performance +
                        " | Valid Code: " + validCode
        );
    }
}
