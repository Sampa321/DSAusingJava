package HomePractice.GeeksForGeeks.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Given a string S which consists of alphabets , numbers and special characters. You need to write a program to split the strings in three different strings S1, S2 and S3 such that the string S1 will contain all the alphabets present in S , the string S2 will contain all the numbers present in S and S3 will contain all special characters present in S.  The strings S1, S2 and S3 should have characters in same order as they appear in input.


Example 1:

Input:
S = geeks01for02geeks03!!!
Output:
geeksforgeeks
010203
!!!
Explanation: The output shows S1, S2 and S3.
Example 2:

Input:
S = **Docoding123456789everyday##
Output:
Docodingeveryday
123456789
**##
 */
public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str =sc.next();
        System.out.println(splitString(str));
    }
    static List<String> splitString(String S) {
        // code here
        String str=new String();
        String num=new String();
        String spe=new String();
        List<String> list = new ArrayList<String>();
        for(int i=0;i<S.length();i++)
        {
            if((S.charAt(i)>='a' && S.charAt(i)<='z') || (S.charAt(i)>='A' && S.charAt(i)<='Z'))
            {
                str+=S.charAt(i);
            }
            else if(S.charAt(i)>='0' && S.charAt(i)<='9')
            {
                num+=S.charAt(i);
            }
            else
            {
                spe+=S.charAt(i);
            }
        }
        if(str.length()!=0){
            list.add(str);
        }else
        {
            list.add("-1");
        }
        if(num.length()!=0){
            list.add(num);
        }else
        {
            list.add("-1");
        }
        if(spe.length()!=0){
            list.add(spe);
        }else
        {
            list.add("-1");
        }

        return list;
    }
}
