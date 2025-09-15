package HomePractice;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
        
        //add element in TreeSet
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");
        System.out.println(cars);  //[BMW, Ford, Mazda, Volvo]


        //Check element is present or not.
        System.out.println(cars.contains("Mazda"));  //true

        //Remove an element from TreeSet
        cars.remove("Volvo");
        System.out.println(cars);  //[BMW, Ford, Mazda]

        //Print the size of TreeSet
        System.out.println(cars.size());  //3

        //Print all element in TreeSet
        for (String i : cars) {
            System.out.print(i+" ");  //BMW,Ford,Mazda
        }

        //Remove all element from TreeSet
        cars.clear();


    }
}
