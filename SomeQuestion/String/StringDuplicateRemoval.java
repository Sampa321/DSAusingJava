package HomePractice.GeeksForGeeks.String;

import java.util.ArrayList;
import java.util.Scanner;

/*
Difficulty: EasyAccuracy: 58.68%Submissions: 115K+Points: 2Average Time: 15m
Given a string s which may contain lowercase and uppercase characters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

Example 1:

Input: s = "geEksforGEeks"
Output: "geEksforG"
Explanation: After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".
Example 2:

Input: s = "HaPpyNewYear"
Output: "HaPpyNewYr"
Explanation: After removing duplicate characters such as e, a, we have string as "HaPpyNewYr".
 */
public class StringDuplicateRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.println("After remove string duplicate character : "+removeDuplicates(str));
    }
   static String removeDuplicates(String s) {
        ArrayList<Character> list =new ArrayList<>();
        StringBuilder newStr=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!list.contains(ch))
            {
                list.add(ch);
            }
        }
        for(char ch:list)
        {
            newStr.append(ch);
        }
        return newStr.toString();
    }
}
