import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

public class FileReader {
    public static void main(String[] args) {
        String fileName = "test.txt"; // Specify your file name here
        try {
            readFile(fileName);
        } catch (EmptyFileException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(String fileName) throws EmptyFileException, FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        if (!scanner.hasNext()) {
            scanner.close();
            throw new EmptyFileException("The file " + fileName + " is empty.");
        }

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
