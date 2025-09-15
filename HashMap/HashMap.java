package HomePractice;

/*A HashMap in Java is a core component of the Collections Framework, implementing the Map interface.
It stores data in key-value pairs, where each unique key maps to a specific value.

 */
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class HashMapFunction {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //Add element  variable.put(key,value)
        map.put("Balloons",10);
        map.put("Apple",80);
        map.put("Pen",10);
        map.put("NoteBook",40);
        map.put("Laptop",60000);
        map.put("Phone",20000);
        System.out.println(map); //{Laptop=60000, Apple=80, Ballons=10, Phone=20000, Pen=10, NoteBook=40}

        //size of map
        System.out.println("size :"+map.size());

        //for find value in this object
        System.out.println(map.get("Balloons"));  //10

        //check key is present or not   and return boolean
        System.out.println(map.containsKey("Apple")); //true


        //print all key
        for(String name: map.keySet())
        {
            System.out.println(name);
        }

        //remove key from map
        map.remove("Laptop");
        System.out.println("After removing Laptop: \n" + map);  //{Apple=80, Phone=20000, Pen=10, NoteBook=40, Balloons=10}

        //check map is empty or not, return boolean
        System.out.println(map.isEmpty()); //false

        //print all values
        for(int i:map.values())
        {
            System.out.println(i);
        }

      

        //Remove all element from map
        map.clear();
        System.out.println(map.isEmpty());//true


    }
}
