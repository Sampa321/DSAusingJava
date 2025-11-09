package HomePractice.LeedCode.Math.Medium;

import java.util.Scanner;

/*
mplement pow(x, n), which calculates x raised to the power n (i.e., xn).
Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25

 */
public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x:");
        double x= sc.nextDouble();
        System.out.print("Enter the value of n :");
        double n = sc.nextDouble();
        System.out.println("Result is : "+myPow(x,n));
    }
    public static double myPow(double x,double n) {
        return Math.pow(x,n);
    }
}
