package HomePractice.GeeksForGeeks.Arrays.Medium;

import java.util.HashMap;
import java.util.Scanner;

/*
Given an array of integers arr[] where, every element appears thrice except for one which occurs once.
Find that element which occurs once.
Examples:
Input: arr[] = [1, 10, 1, 1]
Output: 10
Explanation: 10 occurs once in the array while the other element 1 occurs thrice.
Input: arr[] = [3, 2, 1, 34, 34, 1, 2, 34, 2, 1]
Output: 3
Explanation: All elements except 3 occurs thrice in the array.
 */
public class UniqueNumberIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("Single number is : "+getSingle(arr));
    }
    public static int getSingle(int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele:arr)
        {
            if(map.get(ele)==1)
            {
                return ele;
            }
        }
        return 0;
    }
}
