package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given binary string str of length N. The task is to find the maximum count of consecutive substrings str can be divided into such that all the substrings are balanced i.e. they have an equal number of 0s and 1s. If it is not possible to split str satisfying the conditions then return -1.

Example 1:

Input:
S = "0100110101"
Output: 4
Explanation:
The required substrings are 01, 0011, 01 and 01.

Example 2:

Input:
S = "0111100010"
Output: 3
 */
public class SplitTheBinaryStringIntoSubstringsWithEqualNumberOf0sAnd1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.println("Result is : "+maxSubStr(s1));
    }
    public static int maxSubStr(String str) {
        // Write your code here
        char []arr =str.toCharArray();
        int c=0;
        int b=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='0')
            {
                b+=1;
            }
            else
            {
                b+=-1;
            }
            if(b==0)
            {
                c++;
            }
        }
        return (b==0)?c:-1;
    }
}
