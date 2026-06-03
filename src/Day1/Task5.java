package Day1;

public class Task5 {
    public static void main(String[] args) {
        String st1 = "1000";
        String st2 = "1000.20";

        double doubleVal = Double.parseDouble(st2);
        int intVal = Integer.parseInt(st1);

        int sum = intVal + (int) doubleVal;

        System.out.println("Sum is ; "+sum);
    }
}
