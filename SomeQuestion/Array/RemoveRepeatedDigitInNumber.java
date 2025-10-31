package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;

/*
Given an integer N represented in the form of a string, remove consecutive repeated digits from it.

Example 1:

Input:
N = 1224
Output: 124
Explanation: Two consecutive occurrences of
2 have been reduced to one.
â€‹Example 2:

Input:
N = 1242
Output: 1242
Explanation: No digit is repeating
consecutively in N.
 */
public class RemoveRepeatedDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        long n = sc.nextLong();
        System.out.println("After remove repeated digit :"+modify(n));
    }
    public static long modify(long N) {
        // code
        long num=0;
        while(N!=0)
        {
            int r=(int)(N%10);
            if(N%10==num%10)
            {
                N/=10;
                continue;
            }
            num=num*10+r;
            N/=10;
        }
        long rev=0;
        while(num!=0)
        {
            long rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return rev;
    }
}
