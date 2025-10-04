package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given a string S, remove all consonants and print the modified string that contains vowels only.

Example 1:

Input
S = "abEkipo"
Output
aEio
Explanation : a, E, i, o are only vowels in the string.
Example 2:

Input
S = "rrty"
Output
No Vowel
Explanation: There are no vowels.
 */
public class RemoveConsonantsFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String s1 = sc.next();
        System.out.println("After remove consonants : "+removeConsonants(s1));
    }
    public static String removeConsonants(String s) {
        // code here.
        StringBuilder re=new StringBuilder();
        char []arr =s.toCharArray();
        boolean flag =false;
        for(char ele:arr)
        {
            if(ele=='a' || ele=='e' || ele=='i' || ele=='o' || ele=='u' || ele=='A' || ele=='E' ||
                    ele=='I' || ele=='O'|| ele=='U')
            {
                re.append(ele);
                flag =true;
            }
        }
        if(flag)
        {
            return re.toString();
        }
        else
        {
            return "No Vowel";
        }
    }
}
