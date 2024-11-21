public class TestAdd {
    public static void main(String[] args) {
        // Test case 1: Adding 5 and 1
        int result1 = Add1.addNumbers(5, 1);
        assert result1 == 6 : "Test Case 1 Failed: Expected 6, but got " + result1;
        System.out.println("Adding 5 and 1 = " + result1);

        // Test case 2: Adding 3 and 4
        int result2 = Add1.addNumbers(3, 4);
        assert result2 == 7 : "Test Case 2 Failed: Expected 7, but got " + result2;
        System.out.println("Adding 3 and 4 = " + result2);

        System.out.println("All tests passed!");
    }
}