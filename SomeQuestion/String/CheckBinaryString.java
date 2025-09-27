package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a non-empty sequence of characters s, return true if sequence is Binary, else return false.

Examples:

Input: s = "101"
Output: true
Explanation: Since string contains only '0' and '1', output is true.
Input: s = "75"
Output: false
Explanation: Since string contains digits other than '0' and '1', output is false.
 */
public class CheckBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.next();
        boolean r =isBinary(s);
        if (r)
        {
            System.out.println("all contains o and 1");
        }
        else {
            System.out.println("all contains are not 0 and 1");
        }
    }
    static boolean isBinary(String s) {
        boolean flag =true;
        // Your code here
        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            if(!(ch =='0' || ch =='1')){
                return false;
            }
        }
        return flag;
    }
}
