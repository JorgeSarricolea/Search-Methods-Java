import java.util.Scanner;

public class SequentialSearch {
    public static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] numbers = { 4, 2, 9, 7, 5, 1, 8, 6, 3 };

        System.out.print("Enter the number to search for: ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        scanner.close();

        int index = sequentialSearch(numbers, target);

        if (index != -1) {
            System.out.println("The number " + target + " was found at index " + index);
        } else {
            System.out.println("The number " + target + " was not found in the array");
        }
    }
}