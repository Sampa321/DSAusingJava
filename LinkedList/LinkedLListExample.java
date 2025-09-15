package HomePractice;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        //Add element in linkedList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars); //[Volvo, BMW, Ford, Mazda]

        //Add element in first of the linkedList
        cars.addFirst("sampa");
        System.out.println(cars);  //[sampa, Volvo, BMW, Ford, Mazda]

        //Add element in first of the linkedList
        cars.addLast("Nayak");
        System.out.println(cars);  //[sampa, Volvo, BMW, Ford, Mazda, Nayak]

        //Remove first element from linkedList
        cars.removeFirst();
        System.out.println(cars);  //[Volvo, BMW, Ford, Mazda, Nayak]

        //Remove last element from linkedList
        cars.removeLast();
        System.out.println(cars); //[Volvo, BMW, Ford, Mazda]

        System.out.println(cars.getFirst());  //Volvo

        System.out.println(cars.getLast());  //Mazda
    }
}
