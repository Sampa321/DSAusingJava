package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given two strings str1 and str2, remove those characters from the first string(str1) which are present in the second string(str2). Both the strings are different and contain only lowercase characters.
NOTE: Size of the first string is always greater than the size of the second string( |str1| > |str2|).


Example 1:

Input: str1 = "computer", str2= "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t) from string1 we get "ompuer".
Example 2:

Input: str1 = "occurrence", str2 = "car"
Output: "ouene"
Explanation: After removing characters (c, a, r) from string1 we get "ouene".
 */
public class RemoveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.print("Enter 2nd String:");
        String s2 = sc.next();
        System.out.println("after remove characters : "+removeChars(s1,s2));
    }
    static String removeChars(String str1, String str2) {
        // code here
        StringBuilder res=new StringBuilder();
        for(char c:str1.toCharArray())
        {
            if(str2.indexOf(c)==-1)
            {
                res.append(c);
            }
        }
        return res.toString();
    }
}
