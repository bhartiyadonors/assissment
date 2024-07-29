import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        String[] delimiters = {",", "\n"};
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            String delimiter = numbers.substring(2, delimiterIndex);
            delimiters = new String[]{delimiter};
            numbers = numbers.substring(delimiterIndex + 1);
        }

        String[] numberStrings = numbers.split(String.join("|", delimiters));
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;

        return 0;
    }

    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        System.out.println(calculator.add(""));         // Output: 0
        System.out.println(calculator.add("1"));        // Output: 1
        System.out.println(calculator.add("1,5"));      // Output: 6
        System.out.println(calculator.add("1\n2,3"));   // Output: 6
        System.out.println(calculator.add("//;\n1;2")); // Output: 3
    }
}