package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given two strings A and B, you need to find the last occurrence ( 1 based indexing) of string B in
string A.
Example 1:

Input:
A = abcdefghijklghifghsd
B = ghi
Output:
13
Explanation:
ghi occurs at position 13 for the
last time in string A.
Example 2:

Input:
A = abdbccaeab
B = abc
Output:
-1
Explanation:
abc is not a substring of A
 */
public class LastMatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original String : ");
        String txt = sc.next();
        System.out.print("Enter the substring :");
        String pat =sc.next();
        System.out.println("Find last occurrence : "+findLastOccurence(txt,pat));
    }
    static int findLastOccurence(String A, String B) {
        // code here
        int index=-1;
        if(!A.contains(B))
        {
            return -1;
        }
        int n=A.length();
        int m=B.length();
        for(int i=0;i<=(n-m);i++)
        {
            String t = A.substring(i,i+m);
            if(t.equals(B))
            {
                index=i+1;
            }
        }
        return index;
    }
}
