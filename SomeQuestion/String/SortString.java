package HomePractice.GeeksForGeeks.String;
import java.util.Arrays;
import java.util.Scanner;

/*
Given a string consisting of lowercase letters, arrange all its letters in ascending order.

Example 1:

Input:
S = "edcab"
Output: "abcde"
Explanation: characters are in ascending
order in "abcde".
Example 2:

Input:
S = "xzy"
Output: "xyz"
Explanation: characters are in ascending
order in "xyz".
 */
public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.nextLine();
        System.out.println("After sorting string : "+sort(s1));
    }
    static String sort(String s) {
        // code here
        char []a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
