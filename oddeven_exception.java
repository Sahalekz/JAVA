class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberChecker {
    public static void main(String[] args) {
        try {
            checkEvenNumber(3); // Test with an odd number
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkEvenNumber(4); // Test with an even number
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number " + number + " is odd.");
        }
        System.out.println("The number " + number + " is even.");
    }
}
