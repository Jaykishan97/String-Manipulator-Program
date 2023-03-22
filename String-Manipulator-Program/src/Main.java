import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter a string (blank to exit): ");
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            StringManipulator manipulator = new StringManipulator(input);
            System.out.printf("Original string: %s%n", manipulator.getOriginalString());
            System.out.printf("Reversed string: %s%n", manipulator.getReversedString());
            System.out.printf("Number of characters: %d%n", manipulator.getNumberOfCharacters());
            System.out.printf("Number of words: %d%n", manipulator.getNumberOfWords());
            System.out.printf("Number of sentences: %d%n", manipulator.getNumberOfSentences());
            System.out.printf("Is palindrome: %s%n", manipulator.isPalindrome());
            System.out.printf("Uppercase string: %s%n", manipulator.getUppercaseString());
            System.out.printf("Lowercase string: %s%n", manipulator.getLowercaseString());
            System.out.printf("Replace string: %s%n", manipulator.replaceString());
            System.out.println();
        } while (true);
    }
}

class StringManipulator {
    private String originalString;
    private String reversedString;

    public StringManipulator(String input) {
        originalString = input;
        reversedString = reverseString(input);
    }

    public String getOriginalString() {
        return originalString;
    }

    public String getReversedString() {
        return reversedString;
    }

    public int getNumberOfCharacters() {
        return originalString.length();
    }

    public int getNumberOfWords() {
        String[] words = originalString.split("\\s+");
        return words.length;
    }

    public int getNumberOfSentences() {
        String[] sentences = originalString.split("[.!?]");
        return sentences.length;
    }

    public boolean isPalindrome() {
        String clean = originalString.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

    public String getUppercaseString() {
        return originalString.toUpperCase();
    }

    public String getLowercaseString() {
        return originalString.toLowerCase();
    }

    public String replaceString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string to replace: ");
        String toReplace = scanner.nextLine();
        System.out.print("Enter replacement string: ");
        String replacement = scanner.nextLine();
        return originalString.replaceAll(toReplace, replacement);
    }

    private String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}

