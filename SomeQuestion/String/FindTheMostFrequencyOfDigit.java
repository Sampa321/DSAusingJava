package HomePractice.GeeksForGeeks.String;

import java.util.HashMap;
import java.util.Scanner;

/*
Given a number N, find the most occurring digit in it. If two or more digits occur same number of times, then return the highest of them. Input number is given as a string.

Example 1:

Input:
N = "12234"
Output:
2
Explanation :
2 occurs most times
Example 2:

Input:
N = "1122"
Output:
2
Explanation :
1 and 2 occurs most times but 2 > 1.

 */
public class FindTheMostFrequencyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.next();
        System.out.println("Most frequency of digit : "+solve(str));
    }
    static String solve(String N) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<N.length();i++)
        {
            char ch=N.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=0;
        char ans='0';
        for(char ele:map.keySet())
        {
            int freq=map.get(ele);
            if(freq>max || (freq==max && ele>ans))
            {
                max=freq;
                ans=ele;
            }

        }
        return String.valueOf(ans);
    }
}
