import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        String userInput = scanner.nextLine();

        try {
            // Attempt to convert string to integer
            int age = Integer.parseInt(userInput);
            System.out.println("Your age is: " + age);
        } catch (NumberFormatException e) {
            // Handle invalid number input
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            // Always executed
            System.out.println("Age validation check complete.");
            scanner.close(); // Close scanner to avoid resource leak
        }
    }
}
