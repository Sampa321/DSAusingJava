package HomePractice.GeeksForGeeks.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Given two arrays arr1[], arr2[], and an integer k. The task is to check if after permuting both arrays in such a way, we get the sum of their corresponding element greater than or equal to k i.e. arr1i + arr2i >= k for all i (from 0 to n-1). Return true if possible, else false.

Examples:

Input: k = 10, arr1[] = [2, 1, 3], arr2[] = [7, 8, 9].
Output: true
Explanation: Permutation  arr1[] = [1, 2, 3] and arr2[] = [9, 8, 7] satisfy the condition arr1[i] + arr2[i] >= k
Input: k = 5, arr1[] = [1, 2, 2, 1], arr2[] = [3, 3, 3, 4].
Output: false
Explanation: Since any permutation won't give the answer.
Expected Time Complexity: O(n*log(n))
Expected Auxiliary Space: O(1)

Constraints:
 */
public class PulmutationsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int []arr1 = new int[n];
        System.out.println("Enter the 1st array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr1["+i+"]=");
            arr1[i]=sc.nextInt();
        }
        int []arr2 = new int[n];
        System.out.println("Enter the 2nd array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr2["+i+"]=");
            arr2[i]=sc.nextInt();
        }
        System.out.print("Enter the check element: ");
        int checkEle = sc.nextInt();

        boolean flag = isPossible(checkEle,arr1,arr2);
        System.out.println("Result is : "+flag);
    }
    public static boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        Arrays.sort(arr1);

        // Sort arr2 in ascending order and then reverse it to get descending order
        Arrays.sort(arr2);
        reverse(arr2);

        // Check if there exists a permutation where arr1[i] + arr2[i] >= k for all i
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] + arr2[i] < k) {
                return false; // Not possible
            }
        }

        return true; // Possible
    }

    // Helper method to reverse an int array
    private static void reverse(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

    }
}
