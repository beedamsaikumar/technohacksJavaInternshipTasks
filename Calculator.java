import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operation;
        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter operation (addition, subtraction, multiplication, division): ");
        operation = scanner.next().toLowerCase(); // Convert input to lowercase for case-insensitive check
        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();
        double result = 0;
        switch (operation) {
            case "addition":
                result = num1 + num2;
                break;
            case "subtraction":
                result = num1 - num2;
                break;
            case "multiplication":
                result = num1 * num2;
                break;
            case "division":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        System.out.println("Result: " + result);
    }
}
