package HomePractice.GeeksForGeeks.String;

import java.util.HashMap;
import java.util.Scanner;

/*
Given a string S and another string patt. Find the character in patt that is present at the minimum index in S.


Example 1:

Input: S = "zsyle", patt = "bjz"
Output: "z"
Example 2:

Input: S = "anskg", patt = "me"
Output: "$"
 */
public class MinimumIndexedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.print("Enter 2nd String:");
        String s2 = sc.next();
        System.out.println("Minimum indexed character : "+printMinIndexChar(s1,s2));
    }
    public static String printMinIndexChar(String S, String patt) {
        // Your code here
        HashMap<Character,Integer> map =new HashMap<>();
        char []arr =S.toCharArray();

        for(int i=0;i<patt.length();i++)
        {
            map.put(patt.charAt(i),1);
        }
        for(int i=0;i<S.length();i++)
        {
            if(map.containsKey(S.charAt(i)))
            {
                return S.substring(i,i+1);
            }
        }
        return "$";
        // you don't need to print anything
    }
}
