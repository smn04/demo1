public class Add1 {
    // A method to add two numbers
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("Sum: " + addNumbers(num1, num2));
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers provided. Please input valid integers.");
        }
    }
}