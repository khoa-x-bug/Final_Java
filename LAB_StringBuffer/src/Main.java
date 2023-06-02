import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input line
        String input = scanner.nextLine();

        // Split the input into words
        String[] words = input.split(" ");

        // Get the number of words
        int numWords = Integer.parseInt(words[0]);

        // Initialize the result string
        StringBuilder result = new StringBuilder();

        // Iterate over the words and append them to the result
        for (int i = 1; i < words.length; i++) {
            // Check if the first character is uppercase and not the first word
            if (Character.isUpperCase(words[i].charAt(0)) && i > 1) {
                // If so, add a period to the previous word
                int len = result.length();
                result.setCharAt(len - 1, '.');
                result.append(" ");
            }
            result.append(words[i]);
            if (i < numWords) {
                result.append(" ");
            } else {
                result.append(".");
            }
        }

        // Print the result
        System.out.println(result.toString());
    }
}