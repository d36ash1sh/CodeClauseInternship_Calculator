import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continueCalc;

        do {
            // User input for the first number
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            // User input for the second number
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // User input for the operation
            System.out.print("Choose an operation (+, -, *, /): ");
            char operation = sc.next().charAt(0);

            double result;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation! Please choose +, -, *, or /.");
            }

            // Ask if the user wants to perform another calculation
            System.out.print("Do you want to perform another calculation? (y/n): ");
            continueCalc = sc.next().charAt(0);
        } while (continueCalc == 'y' || continueCalc == 'Y');

        System.out.println("Thank you for using the calculator!");
        sc.close();
    }
}


