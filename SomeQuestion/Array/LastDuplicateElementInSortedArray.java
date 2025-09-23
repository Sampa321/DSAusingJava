package HomePractice.GeeksForGeeks.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
You are given a sorted array arr[] that may contain duplicate elements. Your task is to find the index of the last occurrence of any duplicate element and return the index along with the value of that element. If no duplicate element is found, return [-1, -1].

Examples :

Input: arr[] = [1, 5, 5, 6, 6, 7]
Output: [4, 6]
Explanation: Last duplicate element is 6 having index 4.
Input: arr[] = [1, 2, 3, 4, 5]
Output: [-1, -1]
Explanation: No duplicate elements are present in the array.
 */
public class LastDuplicateElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n= sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        dupLastIndex(arr);
    }
    public static void dupLastIndex(int[] arr) {
        // Complete the function
        int []temp =new int[2];
        int index=-1;
        int ele=-1;
        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i]==arr[i-1])
            {
                index=i;
                ele=arr[i];
                break;
            }
        }
        temp[0]=index;
        temp[1] =ele;
        System.out.println(Arrays.toString(temp));
    }
}
