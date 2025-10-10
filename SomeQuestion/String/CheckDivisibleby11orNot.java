package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a number S. Check whether it is divisble by 11 or not.

Example 1:

Input:
S = 76945
Output: 1
Explanation: The number is divisible by 11
as 76945 % 11 = 0.

â€‹Example 2:

Input:
S = 12
Output: 0
Explanation: The number is not divisible
by 11 as 12 % 11 = 1.

 */
public class CheckDivisibleby11orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        if(divisibleBy11(str)==1)
        {
            System.out.println("String is divisible by 11");
        }
        else {
            System.out.println("String is not divisible by 11");
        }
    }
    static int divisibleBy11(String S) {
        // Your Code Here
        int r=0;
        for(int i=0;i<S.length();i++)
        {
            int ele=S.charAt(i)-'0';
            r=((r*10)+ele)%11;
        }
        if(r==0)
        {
            return 1;
        }
        return 0;
    }
}
