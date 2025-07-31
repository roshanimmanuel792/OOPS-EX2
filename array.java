import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arraysize = a.nextInt();
        int[] array = new int[arraysize];

        System.out.println("Enter the items:");
        for (int i = 0; i < arraysize; i++) {
            array[i] = a.nextInt();
        }

        System.out.print("Unique elements are: ");
        for (int i = 0; i < arraysize; i++) {
            boolean isUnique = true;
            // Check if array[i] appears elsewhere in the array
            for (int j = 0; j < arraysize; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
