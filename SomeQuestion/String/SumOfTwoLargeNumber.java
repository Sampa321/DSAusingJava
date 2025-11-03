package HomePractice.GeeksForGeeks.String;

import java.math.BigInteger;
import java.util.Scanner;

/*
Given two strings denoting non-negative numbers s1 and s2. Calculate the sum of s1 and s2.

Examples:

Input: s1 = "25", s2 = "23"
Output: "48"
Explanation: The sum of 25 and 23 is 48.
Input: s1 = "2500", s2 = "23"
Output: "2523"
Explanation: The sum of 2500 and 23 is 2523.
Input: s1 = "2", s2 = "3"
Output: "5"
Explanation: The sum of 2 and 3 is 5.
 */
public class SumOfTwoLargeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the 1st string:");
        String str1 =sc.next();
        System.out.print("Enter the 2nd string:");
        String str2=sc.next();
        System.out.println("After sum of large number, sum is : "+findSum(str1,str2));
    }
   static String findSum(String s1, String s2) {
        // code here
        BigInteger num1=new BigInteger(s1);
        BigInteger num2=new BigInteger(s2);
        BigInteger sum=num1.add(num2);
        return sum.toString();
    }
}
