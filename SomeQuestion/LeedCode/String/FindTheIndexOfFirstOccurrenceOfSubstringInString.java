package HomePractice.LeedCode.String;

import java.util.Scanner;

/* 28.
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class FindTheIndexOfTheFirstOccurrenceInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Original String :");
        String  str =sc.next();
        System.out.print("Enter the substring :");
        String subStr = sc.next();
        System.out.println("Index of the first occurrence of substring in string : "+strStr(str,subStr));
    }
    public static int strStr(String haystack, String needle) {
        int index=haystack.indexOf(needle);
        return index;
    }
}
