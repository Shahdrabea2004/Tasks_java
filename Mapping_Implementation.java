import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapping_Implementation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an empty HashMap
        // HashMap stores data as key-value pairs, where keys are unique
        //Map is an interface and HashMap is a class implement Map 
        Map<String, Long> map = new HashMap<>();

        // Prompt user for the number of entries
        System.out.print("Enter the number of entries: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer after reading integer input

        // Loop to collect country names and case numbers
        for (int i = 0; i < n; i++) {
            // Input country name
            System.out.print("Enter country name: ");
            String country = scanner.nextLine();

            // Input number of cases
            System.out.print("Enter number of cases: ");
            long numberCases = scanner.nextLong();
            scanner.nextLine(); 

            // Check if the country already exists in the map
            if (map.containsKey(country)) {
                // Update the value for the existing key by adding the new cases
                map.put(country, numberCases + map.get(country));
            } else {
                // Insert a new key-value pair into the map
                map.put(country, numberCases);
            }

            // Another way to insert or update entries in the map using `merge()`
            // `merge` combines the old value and the new value using the specified function (Long::sum here)
           // map.merge(country, numberCases, Long::sum);
        }

        // Display the final data using traditional iteration over the Map
        System.out.println("\nFinal Data:");
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            // Printing each key-value pair
            System.out.println("Country: " + entry.getKey() + ", Cases: " + entry.getValue());
        }
        

        // Another way to print data using `forEach` and Lambda expressions
        /* 
        System.out.println("\nFinal Data:");
        map.forEach((key, value) ->
            System.out.println("Country: " + key + ", Cases: " + value)
        );
        */
    }
}
