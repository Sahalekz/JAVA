class NoVowelException extends Exception {
    public NoVowelException(String message) {
        super(message);
    }
}

public class VowelChecker {
    public static void main(String[] args) {
        try {
            checkForVowels("hello"); // Test with a string containing vowels
            checkForVowels("bcdfg"); // Test with a string without vowels
        } catch (NoVowelException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForVowels(String input) throws NoVowelException {
        if (!input.matches(".*[AEIOUaeiou].*")) {
            throw new NoVowelException("The string \"" + input + "\" does not contain any vowels.");
        }
        System.out.println("The string \"" + input + "\" contains vowels.");
    }
}
