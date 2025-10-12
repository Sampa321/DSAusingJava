package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string S  and a character X, the task is to find the last index (0 based indexing) of X in string S. If no index found then the answer will be -1.


Example 1:

Input: S = "Geeks", P = 'e'
Output: 2
Explanation: Last index of 'e'
is 2.
Example 2:

Input: S = "okiyh", P = 'z'
Output: -1
Explanation: There is no character
as 'z'.
 */
public class LastCharacterOfIndexInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.print("Enter the character : ");
        char ch =sc.next().charAt(0);
        System.out.println("Last Index of character in string : "+LastIndex(str,ch));
    }
   static int LastIndex(String s, char p) {
        // code here
        int idx=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==p)
            {
                idx=i;
            }
        }
        return idx;
    }
}
