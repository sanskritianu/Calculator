package calculator;

	import java.util.Scanner;

	public class Calci {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the first number
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        // Prompt the user to enter the second number
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        // Prompt the user to choose the operation
	        System.out.println("Choose the operation (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        double result;

	        // Perform the operation based on the chosen operator
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                // Check if the second number is not zero to avoid division by zero error
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero!");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operator!");
	                return;
	        }

	        // Display the result
	        System.out.println("Result: " + result);

	        // Close the scanner
	        scanner.close();
	

	}

}
