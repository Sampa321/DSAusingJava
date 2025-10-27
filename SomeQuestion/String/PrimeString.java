package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Provided a String of length N, your task is to find out whether or not the given string is a prime string. A prime string is a string in which the sum of the ASCII value of all the characters is prime.

Example 1:

Input: N = 13, S = "geeksforgeeks"
Output: YES
Explanation: As sum of ASCII is 1381,
which is prime.
â€‹Example 2:

Input: India
Output: NO
Explanation: As sum of ASCII is 485,
 */
public class PrimeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str =sc.next();
        if(isPrimeString(str))
        {
            System.out.println("Prime string");
        }
        else {
            System.out.println("Not prime string");
        }

    }
    public static boolean isPrimeString(String s) {
        // code here.
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int r=s.charAt(i);
            sum+=r;
        }
        for(int i=2;i<sum;i++)
        {
            if(sum%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
