//Write a Java program to create a method that reads a file and throws an exception if the file is not found


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundChecker {

    public static void main(String[] args) {
        String filePath = "D:\\New folder\\12345.txt";  // Change this to your file path
        try {
            readFile(filePath);
            System.out.println("File read successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(String filePath) throws IOException {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new IOException("The file at " + filePath + " was not found.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}