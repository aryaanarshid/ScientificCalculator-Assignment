package scientificcalculator;

import java.util.Scanner;

/**
 * Course: Fundamentals of Programming (Practical)
 * Assignment: Scientific Calculator
 * 
 * Description:
 * Main class handling the user interface (menu display, input taking, error validation)
 * and delegating mathematical calculations to the user-defined methods in the Calculator class.
 */
public class Main {

    /**
     * Displays the calculator menu options to the user.
     */
    public static void displayMenu() {
        System.out.println("\n==============================================");
        System.out.println("            SCIENTIFIC CALCULATOR             ");
        System.out.println("==============================================");
        System.out.println("--- Basic Arithmetic ---");
        System.out.println(" 1. Addition (+)");
        System.out.println(" 2. Subtraction (-)");
        System.out.println(" 3. Multiplication (*)");
        System.out.println(" 4. Division (/)");
        System.out.println("--- Trigonometric Functions (Angle in degrees) ---");
        System.out.println(" 5. Sine (sin)");
        System.out.println(" 6. Cosine (cos)");
        System.out.println(" 7. Tangent (tan)");
        System.out.println("--- Exponential & Logarithmic Functions ---");
        System.out.println(" 8. Power (x^y)");
        System.out.println(" 9. Square Root (√x)");
        System.out.println("10. Natural Logarithm (ln x)");
        System.out.println("11. Base-10 Logarithm (log10 x)");
        System.out.println("--- Rounding Functions ---");
        System.out.println("12. Ceil [Math.ceil()]");
        System.out.println("13. Floor [Math.floor()]");
        System.out.println("14. Round [Math.round()]");
        System.out.println("--- Other Mathematical Operations ---");
        System.out.println("15. Absolute Value (|x|)");
        System.out.println("16. Minimum of Two Numbers");
        System.out.println("17. Maximum of Two Numbers");
        System.out.println("18. Random Number Generator [in range min to max]");
        System.out.println("----------------------------------------------");
        System.out.println(" 0. Exit");
        System.out.println("19. Redisplay Menu");
        System.out.println("==============================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Scientific Calculator Program!");

        // Display the full menu once at the start of the program
        displayMenu();

        // Loop to allow multiple calculations until the user decides to exit
        while (running) {
            // Prompt for new choice without redisplaying the whole menu
            System.out.print("\nEnter your choice (0-18, or 19 to view menu): ");

            // Validate that the user enters an integer for the choice
            if (!scanner.hasNextInt()) {
                System.out.println("[Error] Invalid input! Please enter a valid number (0-18).");
                scanner.next(); // Clear the invalid input from scanner buffer
                continue;
            }

            int choice = scanner.nextInt();

            // Process user's choice using a switch statement
            switch (choice) {
                // ---------------- Exit ----------------
                case 0:
                    running = false;
                    System.out.println("\nThank you for using the Scientific Calculator. Goodbye!");
                    break;

                // ---------------- Basic Arithmetic ----------------
                case 1: { // Addition
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double result = Calculator.add(num1, num2);
                    System.out.printf("Result: %.4f + %.4f = %.4f\n", num1, num2, result);
                    break;
                }

                case 2: { // Subtraction
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double result = Calculator.subtract(num1, num2);
                    System.out.printf("Result: %.4f - %.4f = %.4f\n", num1, num2, result);
                    break;
                }

                case 3: { // Multiplication
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double result = Calculator.multiply(num1, num2);
                    System.out.printf("Result: %.4f * %.4f = %.4f\n", num1, num2, result);
                    break;
                }

                case 4: { // Division
                    System.out.print("Enter numerator: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter denominator: ");
                    double num2 = scanner.nextDouble();

                    // Check for division by zero error
                    if (num2 == 0) {
                        System.out.println("[Error] Division by zero is undefined!");
                    } else {
                        double result = Calculator.divide(num1, num2);
                        System.out.printf("Result: %.4f / %.4f = %.4f\n", num1, num2, result);
                    }
                    break;
                }

                // ---------------- Trigonometric Functions ----------------
                case 5: { // Sine
                    System.out.print("Enter angle in degrees: ");
                    double angle = scanner.nextDouble();
                    double result = Calculator.sine(angle);
                    System.out.printf("Result: sin(%.2f°) = %.4f\n", angle, result);
                    break;
                }

                case 6: { // Cosine
                    System.out.print("Enter angle in degrees: ");
                    double angle = scanner.nextDouble();
                    double result = Calculator.cosine(angle);
                    System.out.printf("Result: cos(%.2f°) = %.4f\n", angle, result);
                    break;
                }

                case 7: { // Tangent
                    System.out.print("Enter angle in degrees: ");
                    double angle = scanner.nextDouble();

                    // Tangent is undefined at 90, 270, -90, -270 degrees, etc.
                    if (Math.abs((angle % 180) - 90) < 1e-9 || Math.abs((angle % 180) + 90) < 1e-9) {
                        System.out.println("[Error] Tangent is undefined at " + angle + " degrees!");
                    } else {
                        double result = Calculator.tangent(angle);
                        System.out.printf("Result: tan(%.2f°) = %.4f\n", angle, result);
                    }
                    break;
                }

                // ---------------- Exponential & Logarithmic ----------------
                case 8: { // Power
                    System.out.print("Enter base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (y): ");
                    double exponent = scanner.nextDouble();
                    double result = Calculator.power(base, exponent);
                    System.out.printf("Result: %.4f ^ %.4f = %.4f\n", base, exponent, result);
                    break;
                }

                case 9: { // Square Root
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();

                    // Square root of negative number is not a real number
                    if (num < 0) {
                        System.out.println("[Error] Cannot calculate square root of a negative number!");
                    } else {
                        double result = Calculator.squareRoot(num);
                        System.out.printf("Result: √(%.4f) = %.4f\n", num, result);
                    }
                    break;
                }

                case 10: { // Natural Logarithm (ln)
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();

                    // Natural logarithm is only defined for numbers > 0
                    if (num <= 0) {
                        System.out.println("[Error] Natural logarithm is only defined for positive numbers (> 0)!");
                    } else {
                        double result = Calculator.naturalLog(num);
                        System.out.printf("Result: ln(%.4f) = %.4f\n", num, result);
                    }
                    break;
                }

                case 11: { // Base-10 Logarithm (log10)
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();

                    // Base-10 logarithm is only defined for numbers > 0
                    if (num <= 0) {
                        System.out.println("[Error] Base-10 logarithm is only defined for positive numbers (> 0)!");
                    } else {
                        double result = Calculator.base10Log(num);
                        System.out.printf("Result: log10(%.4f) = %.4f\n", num, result);
                    }
                    break;
                }

                // ---------------- Rounding Functions ----------------
                case 12: { // Ceil
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    double result = Calculator.ceiling(num);
                    System.out.printf("Result: ceil(%.4f) = %.0f\n", num, result);
                    break;
                }

                case 13: { // Floor
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    double result = Calculator.floorValue(num);
                    System.out.printf("Result: floor(%.4f) = %.0f\n", num, result);
                    break;
                }

                case 14: { // Round
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    long result = Calculator.roundValue(num);
                    System.out.printf("Result: round(%.4f) = %d\n", num, result);
                    break;
                }

                // ---------------- Other Operations ----------------
                case 15: { // Absolute Value
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    double result = Calculator.absoluteValue(num);
                    System.out.printf("Result: |%.4f| = %.4f\n", num, result);
                    break;
                }

                case 16: { // Minimum of two numbers
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double result = Calculator.findMinimum(num1, num2);
                    System.out.printf("Result: min(%.4f, %.4f) = %.4f\n", num1, num2, result);
                    break;
                }

                case 17: { // Maximum of two numbers
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double result = Calculator.findMaximum(num1, num2);
                    System.out.printf("Result: max(%.4f, %.4f) = %.4f\n", num1, num2, result);
                    break;
                }

                case 18: { // Random Number Generator
                    System.out.print("Enter minimum range value: ");
                    double min = scanner.nextDouble();
                    System.out.print("Enter maximum range value: ");
                    double max = scanner.nextDouble();

                    // Check if min is greater than max
                    if (min > max) {
                        System.out.println("[Error] Minimum value cannot be greater than maximum value!");
                    } else {
                        double result = Calculator.generateRandom(min, max);
                        System.out.printf("Result: Random number between %.2f and %.2f = %.4f\n", min, max, result);
                    }
                    break;
                }

                // ---------------- Redisplay Menu ----------------
                case 19: {
                    displayMenu();
                    break;
                }

                // ---------------- Default (Invalid Menu Choice) ----------------
                default:
                    System.out.println("[Error] Invalid choice! Please select an option between 0 and 18 (or 19 to view menu).");
                    break;
            }
        }

        scanner.close(); // Close scanner resource
    }
}
