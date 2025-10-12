package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string S, representing a large integer. Return the largest-valued odd integer (as a string) that is substring of the given string S.


Note: A substring is a contiguous sequence of characters within a string. A null string ("") is also a substring.

Example 1:

Input: s = "504"
Output: "5"
Explanation: The only substring "5" is odd number.


Example 2:

Input: s = "2042"
Output: ""
Explanation: All the possible non-empty substring have even value.
 */
public class LargestOddNumberInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Maximum odd string is : "+maxOdd(str));
    }
   static String maxOdd(String s) {
        // code here

        for(int i=s.length()-1;i>=0;i--)
        {
            int ele=s.charAt(i)-'0';
            if(ele%2!=0)
            {
                return s.substring(0,i+1);
            }
        }

        return " ";
    }
}
