package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a binary string s. You have to count the number of substrings that start and end with 1.

Examples:

Input: s = "1111"
Output: 6
Explanation: There are 6 substrings from the given string. They are "11", "11", "11", "111", "111", "1111".
Input: s = "01101"
Output: 3
Explanation: There are 3 substrings from the given string. They are "11", "101", "1101".
 */
public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.println("No of binary string : "+binarySubstring(s1));
    }
    public static int binarySubstring(String s) {
        // code here
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            {
                c++;
            }
        }
        int r=(c*(c-1))/2;
        return r;
    }
}
