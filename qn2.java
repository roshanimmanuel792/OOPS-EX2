import java.util.Scanner;

public class SimpleCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the characters (space separated): ");
        String input = sc.nextLine();

        String[] parts = input.split(" ");
        char[] chars = new char[parts.length];

        for (int i = 0; i < parts.length; i++) {
            chars[i] = parts[i].charAt(0);
        }

        // Check duplicates
        System.out.print("Duplicate Characters are: ");
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (chars[k] == chars[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.print(chars[i] + " ");
                    }
                    break;
                }
            }
        }

        // Count vowels and consonants
        int vowels = 0, consonants = 0;

        for (int i = 0; i < chars.length; i++) {
            char ch = Character.toLowerCase(chars[i]);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("\nNumber of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}