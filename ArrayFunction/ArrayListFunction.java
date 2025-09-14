package HomePractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Add element
        list.add(12);
        list.add(19);
        list.add(90);
        list.add(45);
        System.out.println(list); //[12,19,90,45]

        //how many elements presents in arraylist.
        System.out.println(list.size());

        //Sort ascending order in arrayList
        Collections.sort (list);
        System.out.println(list);

        //Add element in specific index
        list.add(1,89);
        System.out.println(list); //[12,89,19,90,45]

        //Remove first element in arrayList
        list.removeFirst();
        System.out.println(list); //[89,19,90,45]

        //Remove element of specific index
        list.remove(1);
        System.out.println(list); //[89,90,45]

        //Remove element of specific index
        list.removeLast();
        System.out.println(list);  //[89,90]

        //Get element from this index
        System.out.println(list.get(1)); //90

        //Check ArrayList is empty or not
        System.out.println(list.isEmpty());

        //Check an element is present in arrayList or not.
        System.out.println(list.contains(90));

        //All ArrayList element remove from arrayList
        list.clear();
        System.out.println(list);
    }
}
