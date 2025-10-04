package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string str containing only lowercase letters, generate a string with the same letters, but in uppercase.

Example 1:

Input:
str = "geeks"
Output: GEEKS
Example 2:

Input:
str = "geeksforgeeks"
Output: GEEKSFORGEEKS
 */
public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.nextLine();
        System.out.println("The result is : "+to_upper(s1));
    }
    static String to_upper(String str) {
        // code here
        str=str.toUpperCase();
        return str;
    }
}
