package HomePractice.GeeksForGeeks.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
Now, as you're familiar with operating on arrays, let's do an intricate task. Here, we'll do a swapping of array elements. Given an array arr. The task is to swap every ith element of the array with (i+2)th element.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [3, 4, 5, 2, 1]
Explanation: Swapping 1 and 3, makes the array 3 2 1 4 5. Now, swapping 2 and 4, makes the array 3 4 1 2 5. Again, swapping 1 and 5, makes the array 3 4 5 2 1.
Input: arr[] = [2, 4]
Output: [2, 4]
Explanation: There will be no swapping happen.
Expected Time Complexity: O(n)
Expected Auxilary Space: O(1)


 */
public class NeedSomeChange {
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
        swapElements(arr);
    }
    static void swapElements(int[] arr) {

        // Your code here
        for(int i=0;i<arr.length-2;i++)
        {
            int temp = arr[i];
            arr[i] =arr[i+2];
            arr[i+2] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
