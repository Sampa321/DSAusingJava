package HomePractice.GeeksForGeeks.String;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*
Given a string s of lowercase alphabets, You have to check that  it is isogram or not.
An Isogram is a string in which no letter occurs more than once.

Examples:

Input: s = "machine"
Output: true
Explanation: "machine" is an isogram as no letter has appeared twice. so we return true.
Input: s = "geeks"
Output: false
Explanation: "geeks" is not an isogram as 'e' appears twice. so we return false.
 */
public class IsogramChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.nextLine();
        if(isIsogram(s))
        {
            System.out.println("String is isogram");
        }
        else {
            System.out.println("String is not isogram");
        }
    }
    static boolean isIsogram(String data) {
        // Your code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<data.length();i++)
        {
            if(!map.containsKey(data.charAt(i)))
            {
                map.put(data.charAt(i),1);
            }
            else
            {
                map.put(data.charAt(i),map.get(data.charAt(i))+1);
            }
        }
        int maxValue = Collections.max(map.values());
        if(maxValue==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
