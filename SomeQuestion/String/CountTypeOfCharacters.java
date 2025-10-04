package HomePractice.GeeksForGeeks.String;

import java.util.Arrays;
import java.util.Scanner;

/*
Given a string S, write a program to count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values in the string.
Note: There are no white spaces in the string.

Example 1:

Input:
S = "#GeeKs01fOr@gEEks07"
Output:
5
8
4
2
Explanation: There are 5 uppercase characters,
8 lowercase characters, 4 numeric characters
and 2 special characters.

Example 2:

Input:
S = "*GeEkS4GeEkS*"
Output:
6
4
1
2
Explanation: There are 6 uppercase characters,
4 lowercase characters, 1 numeric characters
and 2 special characters.
 */
public class CountTypeOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.println(Arrays.toString(count(s1)));
    }
    static int[] count(String s) {
        // your code here
        int []re =new int[4];
        int UC=0;
        int LC=0;
        int NC=0;
        int SC=0;
        char []arr=s.toCharArray();
        for(char ele:arr)
        {
            if(Character.isUpperCase(ele))
            {
                UC++;
            }
            else if(Character.isLowerCase(ele))
            {
                LC++;
            }
            else if(ele=='0' || ele=='1' || ele=='2' || ele=='3' || ele=='4' || ele=='5' ||
                    ele=='6' || ele=='7' || ele=='8' || ele=='9')
            {
                NC++;
            }
            else
            {
                SC++;
            }
        }
        re[0]=UC;
        re[1]=LC;
        re[2]=NC;
        re[3]=SC;
        return re;
    }
}
