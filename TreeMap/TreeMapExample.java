package HomePractice;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, String> capitalCities = new TreeMap<>();

        //Add element in TreeMap
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);  //{Austria=Wien, England=London, India=New Dehli, Norway=Oslo, USA=Washington DC}

        //Print the  value of this key from TreeMap
        System.out.println(capitalCities.get("England")); //London

        //Remove an element from TreeMap
        capitalCities.remove("England");
        System.out.println(capitalCities);  //{Austria=Wien, India=New Dehli, Norway=Oslo, USA=Washington DC}

        //Print the size of TreeMap
        System.out.println(capitalCities.size());  //4

        // Print keys
        System.out.print("All keys from TreeMap : ");
        for (String i : capitalCities.keySet()) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("All values from TreeMap : ");
        // Print values
        for (String i : capitalCities.values()) {
            System.out.print(i+" ");
        }
        System.out.println();

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        //Remove all element from TreeMap
        capitalCities.clear();
    }
}
