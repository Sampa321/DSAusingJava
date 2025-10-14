package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
You are given a string s, consisting of lowercase alphabets. Your task is to remove consecutive duplicate characters from the string.

Example:

Input: s = "aabb"
Output:  "ab"
Explanation:
The character 'a' at index 2 is the same as 'a' at index 1, so it is removed.
Similarly, the character 'b' at index 4 is the same as 'b' at index 3, so it is removed.
The final string is "ab".
Input:s = "aabaa"
Output: "aba"
Explanation:
The character 'a' at index 2 is the same as 'a' at index 1, so it is removed.
The character 'a' at index 5 is the same as 'a' at index 4, so it is removed.
The final string is "aba".
Input: s = "abcddcba"
Output: "abcdcba"
Explanation:
The character 'd' at index 5 is the same as 'd' at index 4, so it is removed.
No other consecutive duplicates exist.
The final string is "abcdcba".
 */
public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.println("After remove string duplicate character : "+removeConsecutiveCharacter(str));
    }
    public static String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder re=new StringBuilder();
        re.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                re.append(s.charAt(i));
            }
        }
        return re.toString();
    }
}
