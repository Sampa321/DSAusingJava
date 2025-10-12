package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given two strings consisting of lowercase english alphabets, the task is to check whether these strings are meta strings or not. Meta strings are the strings which can be made equal by exactly one swap in any of the strings. Equal string are not considered here as Meta strings.

Example 1:

Input:
S1 = "geeks", S2 = "keegs"
Output: 1
Explanation: We can swap the 0th and 3rd
character of S2 to make it equal to S1.
Example 2:

Input:
S1 = "geeks", S2 = "geeks"
Output: 0
Explanation: Equal strings are not considered
Meta strings.

 */
public class MetaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String str1 = sc.next();
        System.out.print("Enter 2nd string : ");
        String str2 = sc.next();
        if(metaStrings(str1,str2))
        {
            System.out.println("Two strings are metaString");
        }
        else
        {
            System.out.println("Two strings are not meta string");
        }
    }
     static boolean metaStrings(String S1, String S2) {
        // code here
        int []arr1=new int[2];

        if(S1.equals(S2))
        {
            return false;
        }
        if(S1.length()!=S2.length())
        {
            return false;
        }
        int c=0;
        for(int i=0;i<S1.length();i++)
        {

            if(S1.charAt(i)!=S2.charAt(i))
            {
                if(c==2)
                {
                    return false;
                }
                arr1[c++]=i;
            }
        }
        if(c!=2)
        {
            return false;
        }
        return ((S1.charAt(arr1[0])==S2.charAt(arr1[1])) &&
                (S1.charAt(arr1[1])==S2.charAt(arr1[0])));
    }
}
