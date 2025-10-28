package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string txt and a pattern pat. Your task is to return true if the pattern is present in the given string otherwise return false.

Examples:

Input: txt = "abcdefh", pat = "bcd"
Output: true
Explanation: The pattern "bcd" exist in "abcdefh".
Input: txt = "axzy", pat = "xy"
Output: false
Explanation: xy is not present in txt.

 */
public class ChcekSubStringPresentOrNotInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original String : ");
        String txt = sc.next();
        System.out.print("Enter the substring :");
        String pat =sc.next();
        if(searchPattern(txt,pat))
        {
            System.out.println("Substring is present in string");
        }
        else {
            System.out.println("Substring is not present in string");
        }
    }
    public static boolean searchPattern(String txt, String pat) {
        // code here
        boolean isPresent = txt.contains(pat);
        if(isPresent)
        {
            return true;
        }
        return false;
    }
}
