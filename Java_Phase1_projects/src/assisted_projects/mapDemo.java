
package assisted_projects;

import java.util.*;

public class mapDemo {

	public static void main(String[] args) {
		
		System.out.println("HashMap Example");
		Map<String, Integer> numbers = new HashMap<>();

        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

        System.out.println("Keys: " + numbers.keySet());

        System.out.println("Values: " + numbers.values());

        System.out.println("Entries: " + numbers.entrySet());
       
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);
        
        System.out.println("TreeMap Example");
        
        Map<String, Integer> values = new TreeMap<>();

        // Insert elements to map
        values.put("Second", 2);
        values.put("First", 1);
        System.out.println("Map using TreeMap: " + values);

        // Replacing the values
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("New Map: " + values);

        // Remove elements from the map
        int removedValue = values.remove("First");
        System.out.println("Removed Value: " + removedValue);
	}

}
