package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string S, the task is to create a string with the first letter of every word in the string.


Example 1:

Input:
S = "geeks for geeks"
Output: gfg

Example 2:

Input:
S = "bad is good"
Output: big
 */
public class PrintFirstLetterEveryWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.nextLine();
        System.out.println("First alphabet from string : "+firstAlphabet(s1));
    }
    static String firstAlphabet(String S) {
        // code here
        String res="";
        for(String str:S.split(" "))
        {
            res+=str.charAt(0);
        }
        return res;
    }
}
