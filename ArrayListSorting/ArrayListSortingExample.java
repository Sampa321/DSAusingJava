package HomePractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        //For string:
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.print("Ascending order : ");
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.print(i+" ");   //BMW,Ford,Mazda,Volvo
        }
        System.out.println();

        System.out.print("Descending order : ");
        Collections.sort(cars, Collections.reverseOrder());
        for (String i : cars) {
            System.out.print(i+" ");   //Volvo,Mazda,Ford,BMW
        }
        System.out.println();

        //For Integer:
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        System.out.print("Ascending order : ");
        Collections.sort(myNumbers);  // Sort myNumbers
        for (int i : myNumbers) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Descending order : ");
        Collections.sort(myNumbers, Collections.reverseOrder());
        for (int i :myNumbers) {
            System.out.print(i+" ");   //Volvo,Mazda,Ford,BMW
        }
        System.out.println();
    }
}
