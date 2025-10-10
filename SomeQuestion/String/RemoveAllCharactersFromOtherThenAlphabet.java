package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string S, remove all the characters other than the alphabets.

Example 1:

Input: S = "$Gee*k;s..fo, r'Ge^eks?"
Output: GeeksforGeeks
Explanation: Removed charcters other than
alphabets.


Example 2:

Input:  S = "{{{}}> *& ^%*)"
Output: -1
Explanation: There are no alphabets.
 */
public class RemoveAllCharactersFromOtherThenAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("After remove special character : "+removeSpecialCharacter(str));
    }
    static String removeSpecialCharacter(String s) {
        // code here
        StringBuilder re =new StringBuilder();
        boolean flag =false;
        for(int i=0;i<s.length();i++)
        {
            char ele=s.charAt(i);
            if((ele>='a' && ele<='z') ||(ele>='A' && ele<='Z'))
            {
                re.append(ele);
                flag =true;
            }
        }
        if(flag)
        {
            return re.toString();
        }
        return "-1";
    }
}
