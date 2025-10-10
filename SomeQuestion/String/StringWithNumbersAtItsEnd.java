package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given string s that is appended with a number at last. The task is to check whether the length of string excluding that number is equal to that number.
Example 1:

Input:  s = "geeks5"
Output: 1
Explanation: Length of geeks is 5
and the last number is also 5.
Example 2:

Input:  s = "geek5"
Output: 0
Explanation: Length of geek is 4
and the last number is 5.
 */
public class StringWithNumbersAtItsEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        if(isSame(str)==1)
        {
            System.out.println("String character length same of the number");
        }
        else {
            System.out.println("String character length not same of the number");
        }
    }
   static int isSame(String s) {
        // code here
        int n=0;
        int sum=0;
        int len=0;
        char []arr =s.toCharArray();
        for(char ele:arr)
        {
            if(ele>='0' && ele<='9')
            {
                n=ele-'0';
                sum=sum*10+n;
                len++;
            }
        }

        if(s.length()-len==sum)
        {
            return 1;
        }
        return 0;
    }
}
