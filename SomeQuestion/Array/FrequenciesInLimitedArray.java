package HomePractice.GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
You are given an array arr[] containing positive integers. The elements in the array arr[] range from  1 to n (where n is the size of the array), and some numbers may be repeated or absent. Your have to count the frequency of all numbers in the range 1 to n and return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).

Examples:

Input: arr[] = [2, 3, 2, 3, 5]
Output: [0, 2, 2, 0, 1]
Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.
Input: arr[] = [3, 3, 3, 3]
Output: [0, 0, 4, 0]
Explanation: We have: 1 occurring 0 times, 2 occurring 0 times, 3 occurring 4 times, and 4 occurring 0 times.
Input: arr[] = [1]
Output: [1]
Explanation: We have: 1 occurring 1 time, and there are no other numbers between 1 and the size of the array.
 */
public class FrequenciesInLimitedArray {
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
        System.out.println("Frequency list : "+frequencyCount(arr));
    }
    public static List<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int ele:arr)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        List<Integer> list =new ArrayList<>();
        for(int i=1;i<=arr.length;i++)
        {
            if(map.containsKey(i))
            {
                list.add(map.get(i));
            }
            else
            {
                list.add(0);
            }
        }
        return list;
    }
}
