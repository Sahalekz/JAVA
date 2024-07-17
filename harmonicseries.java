import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in Harmonic Series: ");
        int n = scanner.nextInt();
        scanner.close();

        double sum = 0.0;
        StringBuilder series = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                series.append(" + ");
            }
            series.append("1/" + i);
            sum += 1.0 / i;
        }

        System.out.print("Harmonic Series: " + series);
        System.out.println(" = " + sum);
    }
}
