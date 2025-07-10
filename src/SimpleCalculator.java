/**   
 * Name: Angelo Burke  
 * Date: July 5, 2025  
 * Assignment: 2.2 Project Software Design and Control Statments  
*/  
import java.util.Scanner; 
public class SimpleCalculator { 
static class Calculator { 
    double add(double a, double b) { return a + b; } 
    double subtract(double a, double b) { return a - b; } 
    double multiply(double a, double b) { return a * b; } 
    double divide(double a, double b) { 
        if (b == 0) { 
            System.out.println("Error: Division by zero."); 
            return Double.NaN; 
        } 
        return a / b; 
    } 
} 
 
public static void main(String[] args) { 
    System.out.println("Angelo Burke - 2.2 Project Software Design and Control Statments"); 
    System.out.println("Welcome, please select an option from the menu below."); 
 
    Scanner input = new Scanner(System.in); 
    Calculator calc = new Calculator(); 
 
    while (true) { 
        System.out.println("\n=== Menu ==="); 
        System.out.println("1. Add"); 
        System.out.println("2. Subtract"); 
        System.out.println("3. Multiply"); 
        System.out.println("4. Divide"); 
        System.out.println("5. Quit"); 
        System.out.print("Choose an option (1-5): "); 
        String choice = input.nextLine(); 
 
        if (choice.equals("5")) { 
            System.out.println("Thank you for using the calculator."); 
            break; 
        } 
  
        double num1 = getNumber(input, "Enter the first number: "); 
        double num2 = getNumber(input, "Enter the second number: "); 
        double result = 0; 
        boolean valid = true; 
 
        switch (choice) { 
            case "1": result = calc.add(num1, num2); break; 
            case "2": result = calc.subtract(num1, num2); break; 
            case "3": result = calc.multiply(num1, num2); break; 
            case "4": result = calc.divide(num1, num2); break; 
            default: 
                System.out.println("Invalid option selected."); 
                valid = false; 
        } 
 
        if (valid) { 
            System.out.printf("Result: %.2f\n", result); 
        } 
    } 
    input.close(); 
} 
 
public static double getNumber(Scanner input, String prompt) { 
    while (true) { 
        System.out.print(prompt); 
        try { 
            return Double.parseDouble(input.nextLine()); 
        } catch (NumberFormatException e) { 
            System.out.println("Invalid number. Please try again."); 
        } 
    } 
} 
  
} 