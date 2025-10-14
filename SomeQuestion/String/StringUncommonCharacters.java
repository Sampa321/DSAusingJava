package HomePractice.GeeksForGeeks.String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/*
You are given two strings s1 and s2. Your task is to identify the characters that appear in either string but not in both (i.e., characters that are unique to one of the strings). Return the result as a sorted string.

Examples:

Input: s1 = "geeksforgeeks", s2 = "geeksquiz"
Output: "fioqruz"
Explanation: The characters 'f', 'i', 'o', 'q', 'r', 'u', and 'z' are present in either s1 or s2, but not in both.
Input: s1 = "characters", s2 = "alphabets"
Output: "bclpr"
Explanation: The characters 'b', 'c', 'l', 'p', and 'r' are present in either s1 or s2, but not in both.
Input: s1 = "rome", s2 = "more"
Output: ""
Explanation: Both strings contain the same characters, so there are no unique characters. The output is an empty string.
 */
public class StringUncommonCharacters {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the 1st string:");
        String str1 =sc.next();
        System.out.print("Enter the 2nd string:");
        String str2=sc.next();
        System.out.println("Uncommon characters : "+uncommonChars(str1,str2));
    }
    static String uncommonChars(String s1, String s2) {
        // code here
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        TreeSet<Character> tree = new TreeSet<>();

        for(char ch:s1.toCharArray())
        {
            set1.add(ch);
        }
        for(char ch:s2.toCharArray())
        {
            set2.add(ch);
        }
        for(char ch:set1)
        {
            if(!set2.contains(ch))
            {
                tree.add(ch);
            }
        }
        for(char ch:set2)
        {
            if(!set1.contains(ch))
            {
                tree.add(ch);
            }
        }
        StringBuilder str =new StringBuilder();
        for(char ch:tree)
        {
            str.append(ch);
        }
        return str.toString();
    }
}
