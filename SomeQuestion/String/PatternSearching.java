package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a text and a pattern, the task is to check if the pattern exists in the text or not.

Example 1:

Input: text = "geeksforgeeks"
       pat = "geek"
Output: 1
Explanation: "geek" exists in
"geeksforgeeks"
Example 2:

Input: text = "geeksforgeeks"
pat = "gfg"
Output: 0
Explanation: "gfg" does not exists in
"geeksforgeeks"

 */
public class PatternSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original String:");
        String originalString = sc.next();
        System.out.print("Enter search String:");
        String searchString = sc.next();
        if(search(originalString,searchString)==1)
        {
            System.out.println("Searching string is present in original string");
        }
        else {
            System.out.println("Searching string is not present in original string");
        }

    }
   static int search(String text, String pat) {
        // code here
        if(text.contains(pat))
        {
            return 1;
        }
        return 0;
    }
}
