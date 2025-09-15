package HomePractice;

/*A LinkedHashSet is a collection that stores unique elements and remembers the order they were added.

 */

import java.util.LinkedHashSet;

public class LinedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> cars = new LinkedHashSet<>();

        //Add element in LinkedList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");
        System.out.println(cars);   //[Volvo, BMW, Ford, Mazda]

        //Check element is present or not in LinedHashSet
        System.out.println(cars.contains("Mazda"));  //true

        //Remove an element in LinedHashSet
        cars.remove("Volvo");
        System.out.println(cars);  //[BMW, Ford, Mazda]

        //Size of  LinkedHashSet
        System.out.println(cars.size()); //3

        //Print all element in LinkedHashSet
        for (String car : cars) {
            System.out.print(car+" "); //BMW,Ford,Mazda
        }
        System.out.println();

        //Remove all element in LinkedHashSet
        cars.clear();

        //Check LinkedHashSet is empty or not
        System.out.println(cars.isEmpty());
    }
}
