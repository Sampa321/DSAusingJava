package HomePractice.GeeksForGeeks.String;

import java.util.HashSet;
import java.util.Scanner;

/*
Given a string s, check if it is a "Panagram" or not. Return true if the string is a Panagram, else return false.
A "Panagram" is a sentence containing every letter in the English Alphabet either in lowercase or Uppercase.

Examples:

Input: s = "Bawds jog, flick quartz, vex nymph"
Output: true
Explanation: In the given string, there are all the letters of the English alphabet. Hence, the output is true.
Input: s = "sdfs"
Output: false
Explanation: In the given string, there aren't all the letters present in the English alphabet. Hence, the output is false.
 */
public class PanagramChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.nextLine();
        if(checkPangram(s))
        {
            System.out.println("String is panagram");
        }
        else {
            System.out.println("String is not panagram");
        }
    }
    public static boolean checkPangram(String s) {
        // code here
        if(s.length()<26)
        {
            return false;
        }
        HashSet<Character> a =new HashSet<>();
        s=s.toLowerCase();
        for(char ch:s.toCharArray())
        {
            if(ch>='a' && ch<='z')
            {
                a.add(ch);
            }
        }
        return a.size()==26;
    }
}
