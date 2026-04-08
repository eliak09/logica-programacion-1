import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence or a word: ");
        String text = scanner
                .nextLine();

        String lower = text
                .toLowerCase()
                .replaceAll("[^a-záéíóúüñ0-9]", "");

        String reverse = new StringBuilder(lower)
                .reverse()
                .toString();

        if (lower.equals(reverse)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }

        scanner.close();
    }
}
