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
        int count = 0;
        StringBuilder uniqueNumbers = new StringBuilder();
        for (int i = 0; i < arraysize; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arraysize; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                count++;
                uniqueNumbers.append(array[i]).append(",");
            }
        }
        // Remove the trailing comma
        if (uniqueNumbers.length() > 0) {
            uniqueNumbers.setLength(uniqueNumbers.length() - 1);
        }
        System.out.println("Count=" + count);
        System.out.println("Unique numbers are = " + uniqueNumbers);
    }
}
