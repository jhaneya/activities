import java.util.Scanner;

public class palendroma{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();

        

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }

        scanner.close();
    }
}
