package HomePractice.GeeksForGeeks.String;
/*
Given two strings, s1 and s2. The task is to remove all characters that are common in both strings and then combine the remaining characters from each string to form a new string. The characters that are not shared between the two strings should appear in the result in the same order as they appear in their respective original strings. If, after removing the common characters, no characters are left to form the result, return "-1"

Examples:

Input: s1 = aacdb, s2 = gafd
Output: cbgf
Explanation: The common characters of s1 and s2 are: a, d. The uncommon characters of s1 and s2 are c, b, g and f. Thus the modified string with uncommon characters concatenated is cbgf.
Input: s1 = abcs, s2 = cxzca
Output: bsxz
Explanation: The common characters of s1 and s2 are: a,c. The uncommon characters of s1 and s2 are b,s,x and z. Thus the modified string with uncommon characters concatenated is bsxz.
 */

import java.util.Scanner;

public class RemoveCommonCharactersAndConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.print("Enter 2nd String:");
        String s2 = sc.next();
        System.out.println("After remove common characters and concatenate :"+concatenatedString(s1,s2));
    }
    public static String concatenatedString(String s1, String s2) {
        // code here
        StringBuilder res = new StringBuilder();

        for(char c:s1.toCharArray())
        {
            if(s2.indexOf(c)==-1)
            {
                res.append(c);
            }
        }
        for(char c:s2.toCharArray())
        {
            if(s1.indexOf(c)==-1)
            {
                res.append(c);
            }
        }
        return res.length()>0?res.toString():"-1";
    }
}
