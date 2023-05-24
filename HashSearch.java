import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashSearch {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Mango");
        map.put(5, "Grapes");

        System.out.print("Enter the key to search for: ");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        scanner.close();

        if (map.containsKey(key)) {
            String value = map.get(key);
            System.out.println("The value for key " + key + " is: " + value);
        } else {
            System.out.println("No value found for key " + key);
        }
    }
}
