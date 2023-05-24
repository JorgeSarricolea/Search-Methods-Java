import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Return the index if the target is found
            }

            if (array[mid] < target) {
                left = mid + 1; // Continue searching in the right half
            } else {
                right = mid - 1; // Continue searching in the left half
            }
        }

        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("Enter the number to search for: ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        scanner.close();

        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("The number " + target + " was found at index " + index);
        } else {
            System.out.println("The number " + target + " was not found in the array");
        }
    }
}
