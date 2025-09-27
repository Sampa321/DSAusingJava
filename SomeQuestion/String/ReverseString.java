package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
You are given a string s, and your task is to reverse the string.

Examples:

Input: s = "Geeks"
Output: "skeeG"
Input: s = "for"
Output: "rof"
Input: s = "a"
Output: "a"
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.next();
        String reverse = reverseString(s);
        System.out.println("Reverse string is : "+reverse);
    }
    public static String reverseString(String s) {
        // code here
        String rev = new StringBuilder(s).reverse().toString();
        return rev;
    }
}
