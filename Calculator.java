import java.util.Scanner;

public class Calculator {

    // Calculator methods
    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Divide by zero!");
            return 0;
        }
        return a / b;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEnter two numbers:");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            System.out.println("Choose operation: + - * / or 0 to exit");
            String op = sc.next();

            switch(op) {
                case "+": System.out.println("Result: " + add(num1, num2)); break;
                case "-": System.out.println("Result: " + subtract(num1, num2)); break;
                case "*": System.out.println("Result: " + multiply(num1, num2)); break;
                case "/": System.out.println("Result: " + divide(num1, num2)); break;
                case "0": exit = true; System.out.println("Exiting..."); break;
                default: System.out.println("Invalid operation!");
            }
        }

        sc.close();
    }
}
