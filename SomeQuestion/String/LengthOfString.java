package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
You are given a string s. You need to find the length of the string and return it.

Examples:

Input: s = Geeks
Output: 5
Input: s = Hello1234
Output: 9

 */
public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.println("Length of string : "+lengthString(s1));
    }
    public static int lengthString(String str) {
        // find the length of string
        return str.length();
    }
}
