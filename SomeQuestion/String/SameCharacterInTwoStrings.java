package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given two strings A and B of equal length, find how many times the corresponding position in the two strings hold exactly the same character. The comparison should not be case sensitive.

Example 1:

Input:
A = choice
B = chancE
Output: 4
Explanation: characters at position 0, 1, 4 and 5
are same in the two strings A and B.
Example 2:

Input:
A = Geek
B = gang
Output: 1
Explanation: charactera at position 0 is the
same in the two strings A and B.

 */
public class SameCharacterInTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.print("Enter 2nd String:");
        String s2 = sc.next();
        System.out.println("No of same character : "+sameChar(s1,s2));
    }
   static int sameChar(String A, String B) {
        // code here
        A=A.toLowerCase();
        B=B.toLowerCase();
        int c=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)==B.charAt(i))
            {
                c++;
            }
        }
        return c;
    }
}
