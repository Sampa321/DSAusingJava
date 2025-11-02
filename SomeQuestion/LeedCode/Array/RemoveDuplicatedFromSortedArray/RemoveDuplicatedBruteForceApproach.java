package ClassPractice.Leedcode.Arrays.RemoveDuplicateInSortedArray;

import java.util.HashSet;
import java.util.Scanner;

/*
Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicateBruteForceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> hs =new HashSet<>();
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!hs.contains(arr[i]))
            {
                hs.add(arr[i]);
                arr[k++]=arr[i];
            }
        }
        System.out.println("No of unique elements :"+k);
    }

}
