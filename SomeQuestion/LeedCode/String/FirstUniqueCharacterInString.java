package HomePractice.LeedCode.String;

import java.util.HashMap;
import java.util.Scanner;

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:

Input: s = "loveleetcode"

Output: 2
 */
public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.println("First unique character index is : "+firstUniqChar(s1));
    }
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
    }
}
