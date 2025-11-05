package HomePractice.LeedCode.String;

import java.util.Scanner;

/*
A segment is defined to be a contiguous sequence of non-space characters.
Example 1:

Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
Example 2:

Input: s = "Hello"
Output: 1
 */
public class NumberOfSegmentsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.nextLine();
        System.out.println("Number of segments in string : "+countSegments(s1));
    }
    public static int countSegments(String s) {
        String []arr=s.split(" ");
        int c=0;
        for(String word:arr)
        {
            if(!word.isEmpty())
            {
                c++;
            }
        }
        return c;
    }
}
