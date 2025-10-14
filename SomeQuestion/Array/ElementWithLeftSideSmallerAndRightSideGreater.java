package HomePractice.GeeksForGeeks.Arrays;

import java.util.HashSet;
import java.util.Scanner;

/*
Given an unsorted array of arr. Find the first element in an array such that all of its left elements are smaller and all right elements of its are greater than it.

Note: Return -1 if there is no such element.

Examples :

Input: arr = [4, 2, 5, 7]
Output: 5
Explanation: Elements on left of 5 are smaller than 5 and on right of it are greater than 5.
Input: arr = [11, 9, 12]
Output: -1
Explanation: As no element here which we can say smaller in left & greater in right.
 */
public class ElementWithLeftSideSmallerAndRightSideGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int []arr = new int[n];
        for(int i=0;i< arr.length;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("Find element : "+findElement(arr));
    }
    public static int findElement(int[] arr) {
        // code here
        int re=-1;
        int left_max=arr[0];
        int right_min=arr[arr.length-1];
        HashSet<Integer> set =new HashSet<>();
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>=left_max)
            {
                left_max=arr[i];
                set.add(arr[i]);
            }
        }
        for(int i=arr.length-2;i>0;i--)
        {
            if(arr[i]<=right_min)
            {
                right_min=arr[i];
                if(set.contains(arr[i]))
                {
                    re=arr[i];
                }
            }
        }
        return re;
    }
}
