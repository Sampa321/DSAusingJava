package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string s consisting of upper/lower-case alphabets and empty space characters ‘ ‘. The string may contain spaces at the end. You will have return the length of last word which consists of alphabets only.

Examples :

Input: s = "Geeks for Geeks"
Output: 5
Explanation: The last word is "Geeks" of length 5.
Input: s = "Start Coding Here "
Output: 4
Explanation: The last word is "Here" of length 4.
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Length of last word : "+findLength(str));
    }
    static int findLength(String s) {
        // code here
        s.trim();
        String []arr =s.split(" ");
        return arr[arr.length-1].length();
    }
}
