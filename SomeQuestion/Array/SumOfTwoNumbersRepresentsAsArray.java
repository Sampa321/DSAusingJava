package HomePractice.GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Given two numbers represented by two different arrays, arr1[] and arr2[], the task is to find their sum as a new array. Each array represents a number where each element corresponds to a digit in that number. The resulting sum array should also represent the sum of the two numbers in the same digit-by-digit format.

Note: No leading zeroes in array arr1 and arr2.

Examples:

Input: arr1[] = [5, 6, 3], arr2[] = [8, 4, 2]
Output: [1, 4, 0, 5]
Explanation: As 563 + 842 = 1405.
Input: arr1[] = [2, 2, 7, 5, 3, 3], arr2[] = [4, 3, 3, 8]
Output: [2, 3, 1, 8, 7, 1]
Explanation: As 227533 + 4338 = 231871.
Expected Time Complexity: O(max(n, m))
Expected Auxiliary Space: O(1)
 */
public class SumOfTwoNumbersRepresentsAsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Array size:");
        int n1 = sc.nextInt();
        int []arr1 = new int[n1];
        System.out.println("Enter the 1st array elements: ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print("arr1["+i+"]=");
            arr1[i] =sc.nextInt();
        }

        System.out.print("Enter the second Array size:");
        int n2 = sc.nextInt();
        int []arr2 = new int[n2];
        System.out.println("Enter the 2nd array elements: ");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print("arr2["+i+"]=");
            arr2[i] =sc.nextInt();
        }

        findSum(arr1,arr2);
    }
    static void findSum(int arr1[], int arr2[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int i = arr1.length - 1, j = arr2.length - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += arr1[i--];
            if (j >= 0) sum += arr2[j--];

            result.add(sum % 10);
            carry = sum / 10;
        }
        Collections.reverse(result);
        System.out.println(result);
    }
}
