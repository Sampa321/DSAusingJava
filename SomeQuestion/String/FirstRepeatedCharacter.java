package HomePractice.GeeksForGeeks.String;

import java.util.HashSet;
import java.util.Scanner;

/*
Given a string s. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index of second occurrence is smallest. s contains only lowercase letters.

Examples :

Input: s ="geeksforgeeks"
Output: "e"
Explanation: 'e' repeats at third position.
Input: s ="hellogeeks"
Output: "l"
Explanation: 'l' repeats at fourth position.
Input: s ="abc"
Output: "-1"
Explanation: There is no repeated character.
 */
public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.nextLine();
        System.out.println("First repeated character : "+firstRepChar(s));
    }
    static String firstRepChar(String s) {
        // code here
        HashSet<Character> set =new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(set.contains(c))
                return Character.toString(c);
            set.add(c);
        }
        return "-1";
    }
}
