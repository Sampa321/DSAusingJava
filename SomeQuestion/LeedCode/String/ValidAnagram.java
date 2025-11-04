package HomePractice.LeedCode.String;
import java.util.Arrays;
import java.util.Scanner;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
 */
public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st string:");
        String str1 = sc.next();
        System.out.print("Enter the 2nd string : ");
        String str2 = sc.next();
        if(isAnagram(str1,str2))
        {
            System.out.println("Two string are anagram!");
        }
        else
        {
            System.out.println("Two string are not anagram");
        }
    }
    public static boolean isAnagram(String s, String t) {
        char []arr1 = s.toCharArray();
        char []arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }
}
