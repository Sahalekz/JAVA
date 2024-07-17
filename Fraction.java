public class Fraction {
    private int numerator;
    private int denominator;

    // Constructor to initialize numerator and denominator
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // Simplify the fraction upon initialization
    }

    // Method to simplify the fraction using gcd
    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        // Ensure the denominator is positive for consistency
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Method to calculate gcd (Greatest Common Divisor) using Euclid's algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // Method to add two fractions
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Method to subtract two fractions
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Method to multiply two fractions
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Method to divide two fractions
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Method to get the string representation of the fraction
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create fractions
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);

        // Perform operations and display results
        System.out.println("Fraction 1: " + f1);
        System.out.println("Fraction 2: " + f2);
        System.out.println("Addition: " + f1.add(f2));
        System.out.println("Subtraction: " + f1.subtract(f2));
        System.out.println("Multiplication: " + f1.multiply(f2));
        System.out.println("Division: " + f1.divide(f2));
    }
}
