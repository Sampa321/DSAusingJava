package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
You are given a n length string S of lowercase alphabet characters and the task is to find its matching decimal representation as on the shown keypad. Output the decimal representation corresponding to the string. For ex: if you are given amazon then its corresponding decimal representation will be 262966.



Example 1:

Input:
S = geeksforgeeks
Output: 4335736743357
Explanation:geeksforgeeks is 4335736743357
in decimal when we type it using the given
keypad.
Example 2:

Input:
S = geeksquiz
Output: 433577849
Explanation: geeksquiz is 433577849 in
decimal when we type it using the given
keypad.
 */
public class KeypadTyping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("String to number print : "+printNumber(str,str.length()));
    }
    public static String printNumber(String s, int n) {
        // Your code here
        Long sum=0l;
        for(int i=0;i<s.length();i++)
        {
            char value = s.charAt(i);
            if(value>='a' && value<='c')
            {
                sum=sum*10+2;
            }
            else if(value>='d' && value<='f')
            {
                sum=sum*10+3;
            }
            else if(value>='g' && value<='i')
            {
                sum=sum*10+4;
            }
            else if(value>='j' && value<='l')
            {
                sum=sum*10+5;
            }
            else if(value>='m' && value<='o')
            {
                sum=sum*10+6;
            }
            else if(value>='p' && value<='s')
            {
                sum=sum*10+7;
            }
            else if(value>='t' && value<='v')
            {
                sum=sum*10+8;
            }
            else
            {
                sum=sum*10+9;
            }
        }
        return Long.toString(sum);
    }
}
