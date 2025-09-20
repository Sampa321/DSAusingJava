package HomePractice.GeeksForGeeks.Arrays;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;

/*
Given an array arr. Determine if all the unique elements are contiguous integers.

Example:

Input: arr[] = [5, 2, 3, 6, 4, 4, 6, 6]
Output: Yes
Explanation: The elements of array form a contiguous set of integers which is [2, 3, 4, 5, 6] so the output is "Yes".
Input: arr[] = [10, 14, 10, 12, 12, 13, 15]
Output: No
Explanation: The elements of array form a contiguous set of integers which is [10, 12, 13, 14, 15] so the output is "No".
Expected Time Complexity: O(nlog(n)).
Expected Auxiliary Space: O(n).
 */
public class CheckArrayContainsContiguousInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n =sc.nextInt();
        System.out.println("Enter the array elements:");
        int []arr =new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        boolean checkContinuousContains = areElementsContiguous(arr);
        System.out.println("Elements are contiguous contains ? "+checkContinuousContains);
    }
    static boolean areElementsContiguous(int arr[]) {
        // Complete the function
        HashSet<Integer> s = new HashSet<>();
        for(int ele:arr)
        {
            s.add(ele);
        }
        int []temp= new int[s.size()];
        int index=0;
        for(int ele:s)
        {
            temp[index++]=ele;
        }
        Arrays.sort(temp);
        boolean flag = true;
        for(int i=1;i<temp.length;i++)
        {
            if((temp[i-1]+1)!=temp[i])
            {
                flag =false;
                break;
            }
        }
        return flag;
    }
}
