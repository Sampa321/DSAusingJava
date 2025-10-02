package HomePractice.GeeksForGeeks.String;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
Given a string s without spaces, the task is to remove all duplicate characters from it, keeping only the first occurrence.

Note: The original order of characters must be kept the same.

Examples :

Input: s = "zvvo"
Output: "zvo"
Explanation: Only keep the first occurrence
Input: s = "gfg"
Output: "gf"
Explanation: Only keep the first occurrence
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.next();
        System.out.println("After remove duplicates : "+removeDups(s));
    }
    static String removeDups(String s) {
        // code here

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++)
        {

            set.add(s.charAt(i));
        }
        String re ="";
        ArrayList<Character> list = new ArrayList<>(set);
        for(int i=0;i<list.size();i++)
        {
            re+=list.get(i);
        }
        return re;
    }
}
