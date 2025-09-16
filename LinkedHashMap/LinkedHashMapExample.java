package HomePractice.W3School.JavaDataStructure;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));

        capitalCities.remove("England");

        System.out.println(capitalCities.size());

        // Print keys
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }

        // Print values
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

        // Print keys and values
        for (String key : capitalCities.keySet()) {
            System.out.println("Key: " + key + ", Value: " + capitalCities.get(key));
        }

        capitalCities.clear();
    }
}
