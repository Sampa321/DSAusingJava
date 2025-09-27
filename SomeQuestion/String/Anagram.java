package HomePractice.GeeksForGeeks.String;
import java.util.Arrays;
import java.util.Scanner;

/*
Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.

Examples:

Input: s1 = "geeks" s2 = "kseeg"
Output: true
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
Input: s1 = "allergy", s2 = "allergyy"
Output: false
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams.
Input: s1 = "listen", s2 = "lists"
Output: false
Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.
 */
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.print("Enter 2nd String:");
        String s2 = sc.next();
        boolean result =areAnagrams(s1,s2);
        if(result)
        {
            System.out.println("Two strings are anagram");
        }
        else {
            System.out.println("Two strings are not anagram");
        }
    }
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length())
        {
            return false;
        }
        char []arr1 =s1.toCharArray();
        char []arr2 =s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean flag = true;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
