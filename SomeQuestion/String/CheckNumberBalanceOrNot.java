package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given an integer N which has odd number of digits, find whether the given number is a balanced or not.

An odd digit number is called a balanced number if the sum of all digits to the left of the middle digit and the sum of all digits to the right of the middle digit is equal.

Example 1:

Input:
N = 1234006
Output: 1
Explanation: Total number of digits in
N = 7. Middle digit is 4. LHS = 1+2+3 = 6
and RHS = 0+0+6 = 6. LHS is equal to RHS.

Example 2:

Input:
N = 12345
Output: 0
Explanation: LHS = 1+2 = 3 and RHS = 4+5
= 9. LHS and RHS are not equal.
 */
public class CheckNumberBalanceOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        if(balancedNumber(str))
        {
            System.out.println("Number is balanced");
        }
        else {
            System.out.println("Number is not balanced");
        }
    }
    static Boolean balancedNumber(String N) {
        // your code here
        int si=0;
        int ei=N.length()-1;
        int mid=si+(ei-si)/2;
        int lSum=0;
        int rSum=0;

        for(int i=0;i<mid;i++)
        {
            lSum+=(N.charAt(i)-'0');
        }
        for(int i=mid+1;i<=N.length()-1;i++)
        {
            rSum+=(N.charAt(i)-'0');
        }
        if(lSum==rSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
