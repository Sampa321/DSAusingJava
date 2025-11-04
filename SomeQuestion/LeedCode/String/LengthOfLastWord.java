package HomePractice.LeedCode.String;

import java.util.Scanner;

/* 58.
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str =sc.nextLine();
        System.out.println("Length of last word : "+lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(String s) {
        String str=s.trim();
        String []word=str.split(" ");
        String lastStr="";
        for(String ele:word)
        {
            lastStr=ele;
        }
        return lastStr.length();
    }
}
