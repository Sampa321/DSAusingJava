package HomePractice.LeedCode.String;

import java.util.Scanner;

/*
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false
 */
public class DetectCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = sc.next();
        if(detectCapitalUse(str))
        {
            System.out.println("String is detect capital");
        }
        else {
            System.out.println("String is not detect capital");
        }
    }
    public static boolean detectCapitalUse(String word) {
        String uCase =word.toUpperCase();
        String lCase = word.toLowerCase();
        String capitalized = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        if((word.equals(uCase)) || (word.equals(lCase)) || (word.equals(capitalized)))
        {
            return true;
        }
        return false;
    }
}
