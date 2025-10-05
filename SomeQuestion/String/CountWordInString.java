package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
You are given a string s consisting of multiple words. You need to count the total words in the string. Words are separated by a single space.
Note: It is guaranteed that the last character of the given string is not a white space.

Examples:

Input: s = "Geeks"
Output: 1
Explanation: There is just one word in the given sentence
Input: s = "World is hello"
Output: 3
Explanation: There exists three words in the given sentence
 */
public class CountWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.nextLine();
        System.out.println("No of word in a string : "+countWords(s1));
    }
    public static int countWords(String str) {
        // find and return the number of words
        // present in the string
        String []arr=str.split(" ");
        int c=0;
        for(String string :arr)
        {
            c++;
        }
        return c;
    }
}
