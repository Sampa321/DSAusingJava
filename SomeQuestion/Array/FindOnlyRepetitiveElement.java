package HomePractice.GeeksForGeeks.Arrays;

import java.util.Scanner;
import java.util.Arrays;
/*
Given an array arr[] of size n, filled with numbers from 1 to n-1 in random order. The array has only one repetitive element. Your task is to find the repetitive element.

Note: It is guaranteed that there is a repeating element present in the array.

Examples:

Input: arr[] = [1, 3, 2, 3, 4]
Output: 3
Explanation: The number 3 is the only repeating element.
Input: arr[] = [1, 5, 1, 2, 3, 4]
Output: 1
Explanation: The number 1 is the only repeating element.
Input: arr[] = [1, 1]
Output: 1
Explanation: The array is of size 2 with both elements being 1, making 1 the repeating element.
 */
public class FindOnlyRepetitiveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        int r = findDuplicate(arr);
        System.out.println("duplicate element is : "+r);
    }
    public static int findDuplicate(int[] arr) {
        // code here
        int RepeatEle=0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i])
            {
                RepeatEle = arr[i];
                break;
            }
        }
        return RepeatEle;
    }
}
