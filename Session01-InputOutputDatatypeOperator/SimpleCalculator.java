import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Enter first number (A): ");
        int A = inputValue.nextInt(); // waits for user input

        System.out.print("Enter second number (B): ");
        int B = inputValue.nextInt(); // waits for user input

        int addition = A + B;
        int multiplication = A * B;
        int subtraction = A - B;
        int division = A / B;

        System.out.println("Results:");
        System.out.println("Addition: " + addition);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Division: " + division);

        inputValue.close();
    }
}
