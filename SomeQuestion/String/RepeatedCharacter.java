package HomePractice.GeeksForGeeks.String;

import java.util.HashMap;
import java.util.Scanner;

/*
Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.

NOTE - If there are no repeating characters return '#'.

Example 1:

Input:
S = "geeksforgeeks"
Output: g
Explanation: g, e, k and s are the repeating
characters. Out of these, g occurs first.
Example 2:

Input:
S = "abcde"
Output: -1
Explanation: No repeating character present. (You need to return '#')

Your Task:
You don't need to read input or print anything. Your task is to complete the function firstRep() which takes the string S as input and returns the the first repeating character in the string. In case there's no repeating character present, return '#'.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).


 */
public class RepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Repeated character is : "+firstRep(s));
    }
    static char firstRep(String S) {
        // your code here
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : S.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char c : S.toCharArray()) {
            if (map.get(c) > 1) {
                return c;
            }
        }
        return '#';
    }
}
