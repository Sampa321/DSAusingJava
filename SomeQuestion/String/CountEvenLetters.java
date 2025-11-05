package HomePractice.GeeksForGeeks.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
You are given a string s consisting of lowercase english letters. Your task is to count how many distinct characters appear an even number of times in the string.
Examples:
Input: s = "abacaba"
Output: 2
Explanation: The frequency of a is 4, b is 2 and c is 1 so there are 2 characters with even frequency.
Input: s = "zzacccz"
Output: 0
Explanation:The frequency of z is 3, a is 1 and c is 3 so there are no characters with even frequency.
 */
public class CountEvenLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.next();
        System.out.println("No of even character is : "+count(str));
    }
    public static int count(String s){
        // code here
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int c=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if((entry.getValue())%2==0){
                c++;
            }
        }
        return c;
    }
}
