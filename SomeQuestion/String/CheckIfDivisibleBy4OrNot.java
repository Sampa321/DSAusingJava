package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a number N. Check whether it is divisble by 4.

Example 1:

Input:
N = 1124
Output: 1
Explanation: The number is divisible by 4
as 1124 % 4 = 0.

â€‹Example 2:

Input:
N = 7
Output: 0
Explanation: The number is not divisibly by
4 as 7 % 4 = 3.
 */
public class CheckIfDivisibleBy4OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        if(divisibleBy4(str)==1)
        {
            System.out.println("This string is divisible by 4");
        }
        else {
            System.out.println("This string is not divisible by 4");
        }
    }
    static int divisibleBy4(String N) {
        // Your Code Here
        int lastDigit =N.charAt(N.length()-1)-'0';
        int secondLastDigit=0;
        if(N.length()>1)
        {
            secondLastDigit=N.charAt(N.length()-2)-'0';
        }
        int sum=secondLastDigit*10+lastDigit;
        if(sum%4==0)
        {
            return 1;
        }
        return 0;
    }
}
