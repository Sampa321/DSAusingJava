package HomePractice.GeeksForGeeks.String;

import java.util.HashMap;
import java.util.Scanner;

/*
Given a string containing lower and uppercase alphabets, the task is to find the maximum number of characters between any two same (case sensitivity) character in the string.

Example 1:

Input:
S = "socks"
Output: 3
Explanation: There are 3 characters between
the two occurrences of 's'.
Example 2:

Input:
S = "FoR"
Output: -1
Explanation: No repeating character present.
 */
public class MaximumNumberOfCharactersBetweenAnyTwoSameCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Difference between two same character : "+maxChars(str));
    }
    public static int maxChars(String s) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        int max=-1;
        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            if(map.containsKey(ch))
            {
                max=Math.max(max,i-map.get(ch)-1);
            }
            else
            {
                map.put(ch,i);
            }
        }

        return (max);
    }
}
