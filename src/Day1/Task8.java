package Day1;

public class Task8 {
    public static void main(String[] args) {
        String empCode = "EMP-FIN-2042";
        if (validateEmployeeCode(empCode)) {
            System.out.println("Valid Employee Code");
        }else {
            System.out.println("Invalid Employee Code");
        }
    }

    public static boolean validateEmployeeCode(String empCode) {
        boolean startsCorrectly = empCode.startsWith("EMP");
        boolean hasDepartment = empCode.contains("FIN");
        boolean endsCorrectly = empCode.endsWith("2042");

        return startsCorrectly && hasDepartment && endsCorrectly;
    }
}
