package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;
import java.util.HashMap;
/*
Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'.

Examples:

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.
Input: s = "racecar"
Output: 'e'
Explanation: In the given string, 'e' is the only character in the string which does not repeat.
Input: s = "aabbccc"
Output: '$'
Explanation: All the characters in the given string are repeating.

 */
public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.next();
        char r =nonRepeatingChar(s);
        System.out.println("Non repeating character  is:" +r);
    }
    public static char nonRepeatingChar(String s) {
        // code here
        char []arr =s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }
        for(char c:arr)
        {
            if(map.get(c)==1){
                return c;
            }
        }
        return '$';
    }
}
