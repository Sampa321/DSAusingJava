package HomePractice.LeedCode.String;

import java.math.BigInteger;
import java.util.Scanner;

/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"
 */
public class AddString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st string:");
        String str1 = sc.next();
        System.out.print("Enter the 2nd string : ");
        String str2 = sc.next();
        System.out.println("After add two string,string is : "+addStrings(str1,str2));
    }
    public static String addStrings(String num1, String num2) {
        BigInteger n1=new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger sum=n1.add(n2);
        return sum.toString();
    }
}
