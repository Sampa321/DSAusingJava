package Arrays;
/*Problem Statement: Given an array, we have to find the largest element in the array.
Example 1:
input: arr[]={2,5,1,3,0}
Output:5
 */

/*Approach 1 - Naive approach / Brute-force approach
Use sorting. Sort the array and then get the last element in the array. Done.
Time complexity: depends on sorting algo - Merge sort - O(n*logn)
Space complexity: O(n)
where n = no. of elements in my array.

Approach 2 - Take a variable "max" which will keep track of the maximum element
discovered while traversing over the array.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    static void approach1(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Arrays.sort(arr);
        System.out.println("Largest element : "+arr[arr.length-1]);
    }

    static void approach2(int arr[])
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum element : "+max);
    }

    public static void main(String[] args) throws IOException {

        //Using Scanner
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]= sc.nextInt();
        }*/

        //Using BufferReader
       System.out.println("Enter the integer element of an array (space separated) : ");
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        //or,
        //int [] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //Approach1
        //approach1(arr);

        //Approach2
        approach2(arr);
    }
}
