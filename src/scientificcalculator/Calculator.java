package scientificcalculator;

/**
 * Course: Fundamentals of Programming (Practical)
 * Assignment: Scientific Calculator
 * 
 * Description:
 * Calculator class that encapsulates all mathematical operations and user-defined methods.
 * Utilizes built-in methods from Java's Math class.
 */
public class Calculator {

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
}
