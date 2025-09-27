package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
You are given a string s. Your task is to determine if the string is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.

Examples :

Input: s = "abba"
Output: true
Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
Input: s = "abc"
Output: false
Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.
 */
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.next();
        boolean result =isPalindrome(s);
        if(result)
        {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
    static boolean isPalindrome(String s) {
        // code here
        String rev=new StringBuilder(s).reverse().toString();
        if(s.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
