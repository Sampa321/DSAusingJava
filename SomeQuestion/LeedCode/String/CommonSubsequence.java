package HomePractice.LeedCode.String;

import java.util.Scanner;

/*
Given two strings a and b. Check whether they contain any common subsequence (non empty) or not.

Example 1:
Input:
a = "ABEF" b = "CADE"
Output: 1
Explanation: Subsequence "AE" occurs
in both the strings.

â€‹Example 2:
Input:
a = "ABCD", b = "EFGH"
Output: 0
Explanation: There's no common subsequence
in both the strings.

 */
public class CommonSubsequence {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the 1st string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2nd string  : ");
        String str2 = sc.nextLine();
        if(commonSubseq(str1,str2))
        {
            System.out.print("Common subsequence found");
        }
        else {
            System.out.print("Common subsequence not found");
        }
    }
    public static Boolean commonSubseq(String a, String b) {
        // your code here
        for(int i=0;i<b.length();i++)
        {
            if(a.indexOf(b.charAt(i))>=0)
            {
                return true;
            }
        }
        for(int j=0;j<a.length();j++)
        {
            if(b.indexOf(a.charAt(j))>=0)
            {
                return true;
            }
        }
        return false;
    }
}
