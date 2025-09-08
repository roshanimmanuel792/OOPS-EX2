import java.util.*;
public class SimpleCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the characters (space separated): ");
        String input = sc.nextLine();
        String[] parts = input.trim().split("\\s+");
        char[] chars = new char[parts.length];
        for (int i = 0; i < parts.length; i++) {
            chars[i] = parts[i].charAt(0);
        }
        // Find duplicates
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : chars) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        List<Character> duplicates = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        // Print duplicates
        System.out.print("Duplicate Characters are: ");
        for (int i = 0; i < duplicates.size(); i++) {
            System.out.print(duplicates.get(i));
            if (i != duplicates.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Count vowels and consonants
        int vowels = 0, consonants = 0;
        for (char ch : chars) {
            char lower = Character.toLowerCase(ch);
            if (Character.isLetter(lower)) {
                if ("aeiou".indexOf(lower) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
