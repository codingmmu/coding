package calculator;
import java.util.Scanner;

public class calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculator calculator = new calculator();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + calculator.sum(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));

        try {
            System.out.println("Division: " + calculator.divide(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println("Division Error: " + e.getMessage());
        }

        scanner.close();
    }
}