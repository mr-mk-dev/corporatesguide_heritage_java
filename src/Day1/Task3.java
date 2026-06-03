package Day1;

public class Task3 {
    public static void main(String[] args) {
        byte firstVal = 25;

        short shortValue = firstVal;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("Printing values : byte : "+firstVal +" -> short "
                + shortValue + " -> int " + intValue + " -> long " + longValue + " -> float " + floatValue + " -> double " + doubleValue + " -> End");

    }
}
