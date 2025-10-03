package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;
import java.util.Arrays;
/*
Given a string, check if all its characters are the same or not.

Example 1:

Input:
s = "geeks"
Output: False
Explanation: The string contains different
character 'g', 'e', 'k' and 's'.

Example 2:

Input:
s = "gggg"
Output: True
Explanation: The string contains only one
character 'g'.
 */
public class CheckString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.nextLine();
        if(check(s1))
            System.out.println("all characters same in string");
        else
            System.out.println("all characters aare not same in string ");
    }
    static Boolean check(String s) {
        // your code here
        char []arr=s.toCharArray();

        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]!=arr[i])
            {
                return false;
            }
        }
        return true;
    }
}
