package HomePractice.GeeksForGeeks.String;

import java.util.HashMap;
import java.util.Scanner;

/*
Given a string s, return the index of the first character that appears more than once in the string. If there is no repeated character, return -1.

Examples:

Input: s = "geeksforgeeks"
Output: 0
Explanation: We see that both 'e' and 'g' repeat as we move from left to right.But the leftmost is 'g' so we return leftmost index of 'g' that is 0.
Input: s = "abcd"
Output: -1
Explanation: No character repeats so we return -1.
 */
public class RepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.nextLine();
        if (repeatedCharacter(s) == -1) {
            System.out.println("Repeated character not found");
        } else {
            System.out.println("Repeated character is : "+s.charAt(repeatedCharacter(s)));
        }
    }
    public static int repeatedCharacter(String s) {
        // code here
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.get(ch)>1)
            {
                return i;
            }
        }
        return -1;
    }
}
