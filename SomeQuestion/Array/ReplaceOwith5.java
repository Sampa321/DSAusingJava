package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;

/*
You are given an integer n. You need to convert all zeroes of n to 5.

Examples:

Input: n = 1004
Output: 1554
Explanation: There are two zeroes in 1004 on replacing all zeroes with 5, the new number will be 1554.
Input: n = 121
Output: 121
Explanation: Since there are no zeroes in 121, the number remains as 121.
 */
public class ReplaceOwith5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.println("After convert 5,result is : "+convertfive(n));
    }
   static int convertfive(int num) {
        // Your code here
        if(num==0)
        {
            return 5;
        }
        int sum=0;
        while(num!=0)
        {
            int r=num%10;
            if(r==0)
            {
                r=5;
            }
            sum=sum*10+r;
            num/=10;
        }
        int re=0;
        while(sum!=0)
        {
            int r1=sum%10;
            re=re*10+r1;
            sum/=10;
        }
        return re;
    }
}
