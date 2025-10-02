package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string s containing alphanumeric characters. You have to calculate the sum of all the numbers present in the string.

Examples:

Input: s = "1abc23"
Output: 24
Explanation: 1 and 23 are numbers in the string which is added to get the sum as 24.
Input: s = "geeks4geeks"
Output: 4
Explanation: 4 is the only number, so the sum is 4.
 */
public class SumOfNumberInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Sum of number in string : "+findSum(s));
    }
    public static int findSum(String s) {
        // code here
        String []parts=s.split("\\D+");
        int sum=0;
        for(String x:parts)
        {
            if(!x.isEmpty())
            {
                sum+=Integer.parseInt(x);
            }
        }

        return sum;
    }
}
