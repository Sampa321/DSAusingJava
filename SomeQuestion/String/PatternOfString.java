package HomePractice.GeeksForGeeks.String;

import java.util.ArrayList;
import java.util.Scanner;

/*
Given a string s. Find the pattern of the strings in the examples below.

Examples :

Input: s = "GeeK"
Output: Geek
        Gee
        Ge
        G
Explanation: Decrease one character after each line
Input: s = "G*g"
Output: G*g
        G*
        G
Explanation: Decrease one character after each line
 */
public class PatternOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Pattern string is : "+pattern(str));
    }
   static ArrayList<String> pattern(String s) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            list.add(s.substring(0,i+1));
        }
        return list;
    }
}
