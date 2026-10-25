package scientificcalculator;

import java.util.Scanner;

/**
 * Assignment: Scientific Calculator
 * Course: Fundamentals of Programming (Practical)
 * 
 * Description:
 * A complete menu-driven scientific calculator program in Java.
 * It uses user-defined methods and built-in Java Math class functions.
 * 
 * Features:
 * 1. Basic Arithmetic: Addition, Subtraction, Multiplication, Division.
 * 2. Trigonometric Functions: Sine, Cosine, Tangent (in degrees).
 * 3. Exponential & Logarithmic: Power, Square Root, Natural Log (ln), Base-10 Log (log10).
 * 4. Rounding Functions: ceil(), floor(), round().
 * 5. Other Operations: Absolute value, Minimum, Maximum, Random number generation.
 */
public class ScientificCalculator {

    // ==========================================
    // 1. BASIC ARITHMETIC METHODS
    // ==========================================

    /**
     * Calculates the sum of two numbers.
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Calculates the difference of two numbers.
     * @param a First number
     * @param b Second number
     * @return Result of a - b
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Calculates the product of two numbers.
     * @param a First number
     * @param b Second number
     * @return Result of a * b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Calculates the division of two numbers.
     * @param a Numerator
     * @param b Denominator
     * @return Result of a / b
     */
    public static double divide(double a, double b) {
        return a / b;
    }

    // ==========================================
    // 2. TRIGONOMETRIC METHODS (Built-in Math class)
    // ==========================================

    /**
     * Computes the sine of an angle given in degrees.
     * Math.toRadians() converts the angle to radians because Math.sin expects radians.
     * @param angleDegrees Angle in degrees
     * @return Sine value of the angle
     */
    public static double sine(double angleDegrees) {
        double radians = Math.toRadians(angleDegrees);
        return Math.sin(radians);
    }

    /**
     * Computes the cosine of an angle given in degrees.
     * @param angleDegrees Angle in degrees
     * @return Cosine value of the angle
     */
    public static double cosine(double angleDegrees) {
        double radians = Math.toRadians(angleDegrees);
        return Math.cos(radians);
    }

    /**
     * Computes the tangent of an angle given in degrees.
     * @param angleDegrees Angle in degrees
     * @return Tangent value of the angle
     */
    public static double tangent(double angleDegrees) {
        double radians = Math.toRadians(angleDegrees);
        return Math.tan(radians);
    }

    // ==========================================
    // 3. EXPONENTIAL & LOGARITHMIC METHODS
    // ==========================================

    /**
     * Computes base raised to the power of exponent using Math.pow().
     * @param base Base number
     * @param exponent Exponent power
     * @return base^exponent
     */
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Computes the square root of a number using Math.sqrt().
     * @param number The number
     * @return Square root of the number
     */
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    /**
     * Computes the natural logarithm (base e) of a number using Math.log().
     * @param number The number (must be > 0)
     * @return Natural logarithm of the number
     */
    public static double naturalLog(double number) {
        return Math.log(number);
    }

    /**
     * Computes the base-10 logarithm of a number using Math.log10().
     * @param number The number (must be > 0)
     * @return Base-10 logarithm of the number
     */
    public static double base10Log(double number) {
        return Math.log10(number);
    }

    // ==========================================
    // 4. ROUNDING METHODS (Built-in Math class)
    // ==========================================

    /**
     * Rounds a number up to the nearest mathematical integer using Math.ceil().
     * @param number The number to round up
     * @return Smallest double value >= number that is an integer
     */
    public static double ceiling(double number) {
        return Math.ceil(number);
    }

    /**
     * Rounds a number down to the nearest mathematical integer using Math.floor().
     * @param number The number to round down
     * @return Largest double value <= number that is an integer
     */
    public static double floorValue(double number) {
        return Math.floor(number);
    }

    /**
     * Rounds a number to the nearest long integer using Math.round().
     * @param number The number to round
     * @return Closest long value
     */
    public static long roundValue(double number) {
        return Math.round(number);
    }

    // ==========================================
    // 5. OTHER MATHEMATICAL OPERATIONS
    // ==========================================

    /**
     * Computes the absolute value using Math.abs().
     * @param number Input number
     * @return Absolute value of number
     */
    public static double absoluteValue(double number) {
        return Math.abs(number);
    }

    /**
     * Finds the minimum between two numbers using Math.min().
     * @param a First number
     * @param b Second number
     * @return The smaller of the two numbers
     */
    public static double findMinimum(double a, double b) {
        return Math.min(a, b);
    }

    /**
     * Finds the maximum between two numbers using Math.max().
     * @param a First number
     * @param b Second number
     * @return The larger of the two numbers
     */
    public static double findMaximum(double a, double b) {
        return Math.max(a, b);
    }

    /**
     * Generates a random number in the range [min, max] using Math.random().
     * Math.random() returns a double between 0.0 (inclusive) and 1.0 (exclusive).
     * @param min Minimum bound
     * @param max Maximum bound
     * @return Random number between min and max
     */
    public static double generateRandom(double min, double max) {
        return min + (Math.random() * (max - min));
    }

    // ==========================================
    // MENU DISPLAY METHOD
    // ==========================================

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

    // ==========================================
    // MAIN METHOD
    // ==========================================

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
                    double result = add(num1, num2);
                    System.out.printf("Result: %.4f + %.4f = %.4f\n", num1, num2, result);
                    break;
                }

                case 2: { // Subtraction
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double result = subtract(num1, num2);
                    System.out.printf("Result: %.4f - %.4f = %.4f\n", num1, num2, result);
                    break;
                }

                case 3: { // Multiplication
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double result = multiply(num1, num2);
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
                        double result = divide(num1, num2);
                        System.out.printf("Result: %.4f / %.4f = %.4f\n", num1, num2, result);
                    }
                    break;
                }

                // ---------------- Trigonometric Functions ----------------
                case 5: { // Sine
                    System.out.print("Enter angle in degrees: ");
                    double angle = scanner.nextDouble();
                    double result = sine(angle);
                    System.out.printf("Result: sin(%.2f°) = %.4f\n", angle, result);
                    break;
                }

                case 6: { // Cosine
                    System.out.print("Enter angle in degrees: ");
                    double angle = scanner.nextDouble();
                    double result = cosine(angle);
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
                        double result = tangent(angle);
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
                    double result = power(base, exponent);
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
                        double result = squareRoot(num);
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
                        double result = naturalLog(num);
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
                        double result = base10Log(num);
                        System.out.printf("Result: log10(%.4f) = %.4f\n", num, result);
                    }
                    break;
                }

                // ---------------- Rounding Functions ----------------
                case 12: { // Ceil
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    double result = ceiling(num);
                    System.out.printf("Result: ceil(%.4f) = %.0f\n", num, result);
                    break;
                }

                case 13: { // Floor
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    double result = floorValue(num);
                    System.out.printf("Result: floor(%.4f) = %.0f\n", num, result);
                    break;
                }

                case 14: { // Round
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    long result = roundValue(num);
                    System.out.printf("Result: round(%.4f) = %d\n", num, result);
                    break;
                }

                // ---------------- Other Operations ----------------
                case 15: { // Absolute Value
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    double result = absoluteValue(num);
                    System.out.printf("Result: |%.4f| = %.4f\n", num, result);
                    break;
                }

                case 16: { // Minimum of two numbers
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double result = findMinimum(num1, num2);
                    System.out.printf("Result: min(%.4f, %.4f) = %.4f\n", num1, num2, result);
                    break;
                }

                case 17: { // Maximum of two numbers
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double result = findMaximum(num1, num2);
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
                        double result = generateRandom(min, max);
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
