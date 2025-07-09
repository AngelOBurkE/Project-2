/**  
 * Name: Angelo Burke 
 * Date: July 5, 2025 
 * Assignment: 2.2 Project Software Design and Control Statments 
*/ 
import java.util.Scanner; 
class Calculator { 
    public double add(double a, double b) { 
        return a + b; 
    } 
    public double subtract(double a, double b) { 
        return a - b; 
    } 
    public double multiply(double a, double b) { 
        return a * b; 
    } 
    public double divide(double a, double b) { 
        if (b == 0) { 
            System.out.println("Error: Division by zero."); 
            return Double.NaN; 
        } 
        return a / b; 
    } 
} 

class MenuHandler { 
    public void displayMenu() { 
        System.out.println("\n=== Calculator Menu ==="); 
        System.out.println("1. Add"); 
        System.out.println("2. Subtract"); 
        System.out.println("3. Multiply"); 
        System.out.println("4. Divide"); 
        System.out.println("5. Exit"); 
        System.out.print("Choose an option (1-5): "); 
    } 
} 

public class MainApp { 
    public static void main(String[] args) { 
        System.out.println("Angelo Burke - 2.2 Project Software Design and Control Statments"); 
        System.out.println("Welcome, Please choose an option from the menu below."); 
        Scanner scanner = new Scanner(System.in); 
        Calculator calc = new Calculator(); 
        MenuHandler menu = new MenuHandler(); 
        boolean running = true; 

        while (running) { 
            menu.displayMenu(); 
            int choice; 
            try { 
                choice = Integer.parseInt(scanner.nextLine()); 
            } catch (NumberFormatException e) { 
                System.out.println("Invalid input. Please enter a number between 1 and 5."); 
                continue; 
            } 

            if (choice == 5) { 
                System.out.println("Thank you for using the calculator."); 
                break; 
            } 

            System.out.print("Enter the first number: "); 
            double num1 = readDouble(scanner); 
            System.out.print("Enter the second number: "); 
            double num2 = readDouble(scanner); 
            double result = 0; 
            boolean valid = true; 

            switch (choice) { 
                case 1: 
                    result = calc.add(num1, num2); 
                    break; 
                case 2: 
                    result = calc.subtract(num1, num2); 
                    break; 
                case 3: 
                    result = calc.multiply(num1, num2); 
                    break; 
                case 4: 
                    result = calc.divide(num1, num2); 
                    break; 
                default: 
                    System.out.println("Invalid option selected."); 
                    valid = false; 
            } 

            if (valid) { 
                System.out.printf("Result: %.2f\n", result); 
            } 
        } 
        scanner.close(); 
    } 

    public static double readDouble(Scanner scanner) { 

        while (true) { 

            try { 
                return Double.parseDouble(scanner.nextLine()); 
            } catch (NumberFormatException e) { 
                System.out.print("Invalid number. Please try again: "); 

            } 

        } 

    } 

} 

 