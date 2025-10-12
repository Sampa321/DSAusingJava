package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a number as string(n) , find the remainder of the number when it is divided by 7

Example 1:

Input:
5
Output:
5


Example 2:

Input:
8
Output:
1
 */
public class RemainderWith7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.println("Remainder with 7 in string :"+remainderWith7(str));
    }
    static int remainderWith7(String num) {
        // Your code here
        char []arr=num.toCharArray();
        int re=0;
        int rem=0;
        for(char ele:arr)
        {
            int value =ele-'0';
            re=rem*10+value;

            rem=re%7;

        }

        return rem;
    }
}
