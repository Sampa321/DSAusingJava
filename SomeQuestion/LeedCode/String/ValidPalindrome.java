package HomePractice.LeedCode.String;

import java.util.Scanner;

/* 125.
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str =sc.next();
        if(isPalindrome(str))
        {
            System.out.println("Valid palindrome");
        }
        else {
            System.out.println("Not valid palindrome");
        }
    }
    public static boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
                str+=ch;
            }
        }
        str=str.toLowerCase();
        String rev=new StringBuilder(str).reverse().toString();
        if(str.equals(rev))
        {
            return true;
        }
        return false;
    }
}
