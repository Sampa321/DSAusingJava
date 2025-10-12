package HomePractice.GeeksForGeeks.String;

import java.util.Scanner;

/*
Given an odd number in the form of string, the task is to make largest even number possible from the given number provided one is allowed to do exactly only one swap operation, if no such number is possible then return the input string itself.

Example 1:

Input:
s = 4543
Output: 4534
Explanation: Swap 4(3rd pos) and 3.


Example 2:

Input:
s = 1539
Output: 1539
Explanation: No even no. present.



 */
public class OddToEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("The result string is : "+makeEven(str));
    }
    public static String makeEven(String s) {

        char []arr=s.toCharArray();
        int n=arr.length;
        int idx=-1;
        for(int i=0;i<arr.length-1;i++)
        {
            int ele=s.charAt(i)-'0';
            if(ele%2==0)
            {
                idx=i;//2
                if(arr[i]<arr[n-1])
                {
                    break;
                }
            }

        }
        if(idx==-1)
        {
            return s;
        }
        char temp=arr[idx];
        arr[idx]=arr[n-1];
        arr[n-1]=temp;
        return new String(arr);
    }
}
