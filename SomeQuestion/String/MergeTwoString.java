package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given two strings S1 and S2 as input, the task is to merge them alternatively i.e. the first character of S1 then the first character of S2 and so on till the strings end.
NOTE: Add the whole string if other string is empty.

Example 1:

Input:
S1 = "Hello" S2 = "Bye"
Output: HBeylelo
Explanation: The characters of both the
given strings are arranged alternatlively.
â€‹Example 2:

Input:
S1 = "abc", S2 = "def"
Output: adbecf
Explanation: The characters of both the
given strings are arranged alternatlively.

 */
public class MergeTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.print("Enter 2nd String:");
        String s2 = sc.next();
        System.out.println("After merge two string : "+merge(s1,s2));
    }
    static String merge(String S1, String S2) {
        // code here
        StringBuilder res = new StringBuilder();
        int n=S1.length()>S2.length()?S1.length():S2.length();
        for(int i=0;i<n;i++)
        {
            if(!(i>=S1.length()))
            {
                res.append(S1.charAt(i));
            }
            if(!(i>=S2.length()))
            {
                res.append(S2.charAt(i));
            }
        }
        return res.toString();
    }
}
