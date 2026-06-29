package Day19;

public class ExpandString {
    public static void main(String[] args) {
        String input = "a4b2c5d1";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i);
            int count = input.charAt(i + 1) - '0';

            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}