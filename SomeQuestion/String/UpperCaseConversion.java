package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Input: s = "gEEKs"
Output: "GEEKs"
Input: s = "i love programming"
Output: "I Love Programming"
 */
public class UpperCaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        System.out.println("The result string is :"+convert(str));
    }
    public static String convert(String s) {
        // code here
        StringBuilder re=new StringBuilder();
        String []items=s.split(" ");
        for(String ele:items)
        {
            re.append(Character.toUpperCase(ele.charAt(0)));
            re.append(ele.substring(1));
            re.append(" ");

        }

        return re.toString().trim();
    }

}
