package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given two strings  S1 and S2 . You have to concatenate both the strings and print the concatenated string.

Example 1:

Input:
S1 = "Geeksfor"
S2 = "Geeks"
Output: GeeksforGeeks
Explanation: Combined "Geeksfor" and "Geeks"


Example 2:

Input:
S1 = "Practice"
S2 = "Hard"
Output: PracticeHard
Explanation: Combined "Practice" and "Hard"
 */
public class AddTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.print("Enter 2nd String:");
        String s2 = sc.next();
        System.out.println("After concatenation two string : "+conCat(s1,s2));
    }
   static String conCat(String s1, String s2) {
        // code here.
        return s1.concat(s2);
    }
}
