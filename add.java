import java.util.Arrays;
import java.util.List;

public class add {
    public static void main(String[] args) {
        // Initialize the list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        // Variable to store the sum
        int sum = 0;

        // Loop through the list and calculate the sum
        for (int number : numbers) {
            sum += number;
        }

        // Print the result
        System.out.println("The sum of the numbers in the list is: " + sum);
    }
}
