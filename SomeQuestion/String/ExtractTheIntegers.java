package HomePractice.GeeksForGeeks.String;

import java.util.ArrayList;
import java.util.Scanner;

/*
Given a string s, extract all the integers from s.

Example 1:

Input:
s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,
     3: Rishabh Gupta56"
Output: 1 2 3 56
Explanation:
1, 2, 3, 56 are the integers present in s.
Example 2:

Input:
s = "geeksforgeeks"
Output: No Integers
Explanation:
No integers present in the string.
 */
public class ExtractTheIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Extract integer words : "+extractIntegerWords(str));
    }
   static ArrayList<String> extractIntegerWords(String s) {
        // code here
        ArrayList<String> re=new ArrayList<String>();
        for(int i=0;i<s.length();i++)
        {
            String str="";
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                str+=ch;
                for(int j=i+1;j<s.length();j++)
                {
                    char ch1=s.charAt(j);
                    if(ch1>='0' && ch1<='9')
                    {
                        str+=ch1;
                        i++;
                    }
                    else
                    {
                        break;
                    }
                }
                re.add(str);
            }
        }
        return re;
    }
}
