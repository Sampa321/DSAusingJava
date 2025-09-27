package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string s. Your task is to remove spaces from it.

Examples:

Input: s = "geeks  for geeks"
Output: "geeksforgeeks"
Explanation: All the spaces have been removed.
Input: s = "    g f g"
Output: "gfg"
Explanation: All the spaces including the leading ones have been removed
 */
public class RemoveSpace {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the string:");
            String s = sc.nextLine();
            System.out.println("After remove space : "+modify(s));
    }
    static String modify(String s) {
        // your code here
        String re = "";
        for(String str:s.split(" "))
        {
            re+=str;
        }
        return re;
    }
}

