package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string, The task is to count the number of alphabets present in the string.

Example 1:

Input:
S = "adjfjh23"
Output: 6
Explanation: only last 2 are not
alphabets.
Example 2:

Input:
S = "n0ji#k$"
Output: 4
Explanation: #, $, 0 are not alphabets.
 */
public class CountAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.next();
        System.out.println("Count no of alphabets : "+Count(str));
    }
    static int Count(String S) {
        // code here
        int c=0;
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
                c++;
            }
        }
        return c;
    }
}
