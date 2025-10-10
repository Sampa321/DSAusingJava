package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
You are given two long numbers N1 and N2 in a string. You need to find out if the product of these numbers generate an even number or an odd number, If it is an even number print 1 else print 0.

Example 1:

Input:
N1 = "12"
N2 = "15"
Output: 1
Explanation: 12 * 15 = 180 which is an
even number.
â€‹Example 2:

Input:
N1 = "123"
N2 = "457"
Output: 0
Explanation: 123*457 = 56211 which is an
odd number.
 */
public class ProductIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String str1 = sc.next();
        System.out.print("Enter 2nd string : ");
        String str2 = sc.next();
        if(EvenOdd(str1,str2)==1)
        {
            System.out.println("String product is even");
        }
        else {
            System.out.println("String product is odd");
        }
    }
    static int EvenOdd(String n1, String n2) {
        // code here.
        int r1=(n1.charAt(n1.length()-1)-'0')%2;
        int r2=(n2.charAt(n2.length()-1)-'0')%2;
        int re=r1*r2;
        if(re%2==0)
        {
            return 1;
        }
        return 0;
    }
}
