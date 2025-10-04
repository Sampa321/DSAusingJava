package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string s, the task is to change the complete string to uppercase or lowercase depending on the case of the first character.

Examples:

Input: s = "abCD"
Output: "abcd"
Explanation: The first letter (a) is lowercase. Hence, the complete string is made lowercase.
Input: s = "Abcd"
Output: "ABCD"
Explanation: The first letter (A) is uppercase. Hence, the complete string is made uppercase.

 */
public class ChangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.println("After modify,string is: "+modify(s1));
    }
    static String modify(String s) {
        char []arr =s.toCharArray();
        if(Character.isLowerCase(arr[0]))
        {
            return s.toLowerCase();
        }
        else
        {
            return s.toUpperCase();
        }
    }
}
