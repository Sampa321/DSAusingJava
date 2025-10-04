package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string. Count the number of Camel Case characters in it.

Example 1:

Input:
S = "ckjkUUYII"
Output: 5
Explanation: Camel Case characters present:
U, U, Y, I and I.

â€‹Example 2:

Input:
S = "abcd"
Output: 0
Explanation: No Camel Case character
present.
 */
public class CountCamelCaseCharactersFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.nextLine();
        System.out.println("No of camelCase : "+countCamelCase(s1));
    }
    static int countCamelCase(String s) {
        // your code here
        char []arr =s.toCharArray();
        int c=0;
        for(char ele:arr)
        {
            if(ele=='A' || ele=='B' || ele=='C' || ele=='D' || ele=='E' || ele=='F' || ele=='G' ||
                    ele=='H' || ele=='I' || ele=='J' || ele=='K' || ele=='L' || ele=='M' ||
                    ele=='N' || ele=='O' || ele=='P' || ele=='Q' || ele=='R' || ele=='S' || ele=='T' ||
                    ele=='U' || ele=='V' || ele=='W' || ele=='X' || ele=='Y' || ele=='Z')
            {
                c++;
            }
        }
        return c;
    }
}
