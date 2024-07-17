import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

public class ReadNumberFromFileException {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\sahal\\Desktop\\New folder\\Java\\n" + //
                        "umber.txt"; // Specify your file name here
        try {
            checkNumbers(fileName);
        } catch (PositiveNumberException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkNumbers(String fileName) throws PositiveNumberException, FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            numbers.add(number);
            if (number > 0) {
                scanner.close();
                throw new PositiveNumberException("Positive number found: " + number);
            }
        }

        scanner.close();
        System.out.println("All numbers are non-positive.");
    }
}
