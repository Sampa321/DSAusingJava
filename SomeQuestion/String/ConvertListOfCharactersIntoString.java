package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a list of characters, merge all of them into a string.

Example 1:

Input:
N = 13
Char array = g e e k s f o r g e e k s
Output: geeksforgeeks
Explanation: combined all the characters
to form a single string.

Example 2:

Input:
N = 4
Char array = e e b a
Output: eeba
Explanation: combined all the characters
to form a single string.
 */
public class ConvertListOfCharactersIntoString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array list size: ");
        int n=sc.nextInt();
        char []arr =new char[n];
        System.out.println("Enter the char list items:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        System.out.println("String is : "+chartostr(arr,n));
    }
    public static String chartostr(char arr[], int N) {
        StringBuilder res =new StringBuilder();
        for(char ele:arr)
        {
            res.append(ele);
        }
        return res.toString();
    }
}
