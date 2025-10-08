package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given an n-digit large number n in form of string, check whether it is divisible by 7 or not. Return 1 if divisible by 7, otherwise 0.

Examples :

Input: n = "49"
Output: 1
Explanation: 49 is divisible by 7.
Input: n = "1000"
Output: 0
Explanation: 1000 is not divisible by 7.
 */
public class Divisibleby7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        if(isdivisible7(str) == 1)
        {
            System.out.println("This string divisible by 7");
        }
        else {
            System.out.println("This string is not divisible by 7");

        }
    }
    static int isdivisible7(String num) {
        // code here
        int n=0;
        for(int i=0;i<num.length();i++)
        {
            n=(n*10+(num.charAt(i)-'0'))%7;
        }

        if(n==0)
        {
            return 1;
        }
        return 0;
    }
}
