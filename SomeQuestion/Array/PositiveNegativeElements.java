package HomePractice.GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/*
Given an array arr containing equal number of positive and negative elements, arrange the array such that every positive element is followed by a negative element.
Note: The relative order of positive and negative numbers should be maintained.

Examples:

Input: arr[] = [-1, 2, -3, 4, -5, 6]
Output: [2, -1, 4, -3, 6, -5]
Explanation: Positive numbers in order are 2, 4 and 6. Negative numbers in order are -1, -3 and -5. So the arrangement we get is 2, -1, 4, -3, 6 and -5.
Input: arr[] = [-3, 2, -4, 1]
Output: [2, -3, 1, -4]
Explanation: The positive numbers are 2,1 and negative numbers are -3, -4

 */
public class PositiveNegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st array size:");
        int n= sc.nextInt();
        ArrayList<Integer> newList =new ArrayList<>();
        System.out.println("Enter the arrayList elements:");
        for(int i=0;i<n;i++)
        {
            int ele = sc.nextInt();
            newList.add(ele);
        }
        System.out.println("After arranged arraylist : "+arranged(newList));
    }
   static ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        // code here
        int []arr1=new int[arr.size()/2];
        int []arr2 = new int[arr.size()/2];
        int index1=0;
        int index2=0;
        for(int ele:arr)
        {
            if(ele>0)
            {
                arr1[index1++]=ele;
            }
            else
            {
                arr2[index2++]=ele;
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr1.length;i++)
        {
            list.add(arr1[i]);
            list.add(arr2[i]);
        }
        return list;
    }
}
