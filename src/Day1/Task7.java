package Day1;

public class Task7 {
    public static void main(String[] args) {
        String empCode = "EMP-FIN-2042";
        System.out.println("Employee Code : " + empCode);
        System.out.println("Department : " + empCode.substring(4, 7));
        System.out.println("Employee Number : " + empCode.substring(8));
        System.out.println("First Character : " + empCode.charAt(0));
    }
}
