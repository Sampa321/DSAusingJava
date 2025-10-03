package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string s. Your task is to remove the vowels from the string.

Examples:

Input: s = "welcome to geeksforgeeks"
Output: "wlcm t gksfrgks"
Explanation: Vowels were ignored only consonents were returned in the same order.
Input: s = "what is your name ?"
Output: wht s yr nm ?
 */
public class RemoveVowelFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.nextLine();
        System.out.println("After remove vowel : "+removeVowels(s1));
    }
    static String removeVowels(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                continue;
            }
            else
            {
                res.append(c);
            }
        }
        return res.toString();
    }
}
