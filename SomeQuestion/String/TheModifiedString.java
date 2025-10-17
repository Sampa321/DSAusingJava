package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Ishaan is playing with strings these days. He has found a new string. He wants to modify it as per the following rules to make it valid:

The string should not have three consecutive same characters.
He can add any number of characters anywhere in the string.
Find the minimum number of characters which Ishaan must insert in the string to make it valid.

Examples:

Input: s = "aabbbcc"
Output: 1
Explanation: In "aabbbcc" 3 b's occur consecutively, we add a 'd',and Hence, output will be "aabbdbcc".
Input: s = "aaaaa"
Output: 2
Explanation: In "aaaaa" 5 a's occur consecutively,we need to add 2 'b', and Hence, the output will be "aababaa".

 */
public class TheModifiedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.nextLine();
        System.out.println("No of modified string : "+modified(s));
    }
    public static int modified(String s) {
        //  code here
        int c=0;
        for(int i=1;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                continue;
            }
            if(s.charAt(i)!=s.charAt(i+1))
            {
                i++;
                continue;
            }
            c++;
            i++;
        }
        return c;
    }
}
