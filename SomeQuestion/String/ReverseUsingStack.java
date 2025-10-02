package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
You are given a string s , the task is to reverse the string using stack.

Examples:

Input: s ="GeeksforGeeks"
Output:  skeeGrofskeeG
Input: s ="Geek"
Output: keeG
 */
public class ReverseUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.next();
        System.out.println("After reverse using stack : "+reverse(s));
    }
    public static String reverse(String S) {
        // code here
        String re = new StringBuilder(S).reverse().toString();
        return re;
    }
}
