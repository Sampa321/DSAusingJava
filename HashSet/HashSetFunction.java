package HomePractice;

//A HashSet is a collection of elements where every element is unique.

import java.util.HashSet;
import java.util.Set;

public class HashSetFunction {
    public static void main(String[] args) {
        // Create an empty HashSet to store String objects
        Set<String> mySet = new HashSet<>();

        // Create a HashSet initialized with elements from another collection
        Set<Integer> numbers = new HashSet<>(Set.of(1, 2, 3));   //[1,2,3]

        //add an element in set.
        numbers.add(34);  //[1,2,3,34]
        numbers.add(1); //[1,2,3,34]  Because any element present in one times.
        System.out.println(numbers);

        //check an element is present in set or not
        boolean r= numbers.contains(12); //false
        System.out.println(r);

        //Remove an element from set
        numbers.remove(1);  //[2,3,34]
        System.out.println(numbers);

        //Print how no of element present in set
        int size = numbers.size();  //3
        System.out.println("Size of set: "+size);

        //All element remove from set
        //numbers.clear();
        System.out.println(numbers);

        //check set is empty or not.
        boolean check = numbers.isEmpty();
        System.out.println(check);

        //Representation the class of the object
        System.out.println(numbers.getClass()); //class java.util.HashSet
    }
}
