package HomePractice.GeeksForGeeks.Arrays;
import java.util.Scanner;
import java.util.Arrays;
/*
Given an array arr[] of numbers from 0 to 9. Your task is to rearrange elements of the array such that after combining all the elements of the array, the number formed is maximum.

Examples:

Input: arr[] = [9, 0, 1, 3, 0]
Output: 93100
Explanation: Largest number is 93100 which can be formed from array digits.
Input: arr[] = [1, 2, 3]
Output: 321
 */
public class FromLargestNumberFromDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array:");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        String  r = MaxNumber(arr);
        System.out.println("Maximum number : "+r);
    }
    public static String MaxNumber(int arr[]) {
        // code here.
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
        }
        String sortedString = sb.toString();
        return sortedString;
    }
}
