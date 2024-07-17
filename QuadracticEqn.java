import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients for the quadratic equation ax^2 + bx + c = 0:");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No real solutions exist.");
        } else if (discriminant == 0) {
            double solution = -b / (2 * a);
            System.out.println("Single real solution: x = " + solution);
        } else {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            double solution1 = (-b + sqrtDiscriminant) / (2 * a);
            double solution2 = (-b - sqrtDiscriminant) / (2 * a);
            System.out.println("Two real solutions:");
            System.out.println("x1 = " + solution1);
            System.out.println("x2 = " + solution2);
        }

        scanner.close();
    }
}
