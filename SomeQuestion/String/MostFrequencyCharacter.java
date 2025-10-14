package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s. If more than one character occurs the maximum number of times then print the lexicographically smaller character.

Examples:

Input: s = "testsample"
Output: 'e'
Explanation: 'e' is the character which is having the highest frequency.
Input: s = "output"
Output: 't'
Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller.
 */
public class MostFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.println("Most frequency character : "+getMaxOccuringChar(str));
    }
    public static char getMaxOccuringChar(String s) {
        // code here
        TreeMap<Character,Integer> map=new TreeMap<>();
        char []arr=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=0;
        Set<Character> s1 =map.keySet();
        for(char j:s1)
        {
            max=Math.max(max,map.get(j));
        }
        for(char ch:s1)
        {
            if(map.get(ch)==max)
            {
                return ch;
            }
        }
        return 0;
    }
}
