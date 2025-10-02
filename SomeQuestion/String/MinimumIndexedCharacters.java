package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string s1 and another string s2. Find the minimum index of the character in s1 that is also present in s2. if no character common in both then return -1.

Examples :

Input: s1 = "geeksforgeeks", s2 = "set"
Output: 1
Explanation: 'e' is the character which is present in given s1 "geeksforgeeks" and is also present in s2 "set". Minimum index of e is 1.
Input: s1 = "adcffaet", s2 = "onkl"
Output: -1
Explanation: There are none of the characters which is common in s1 and s2.
Constraints:
 */
public class MinimumIndexedCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.print("Enter 2nd String:");
        String s2 = sc.next();
        System.out.println("Minimum indexed character : "+minIndexChar(s1,s2));
    }
    public static int minIndexChar(String s1, String s2) {
        // code here

        for(int i=0;i<s1.length();i++)
        {
            if(s2.contains(String.valueOf(s1.charAt(i))))
            {
                return i;
            }
        }
        return -1;
    }
}
