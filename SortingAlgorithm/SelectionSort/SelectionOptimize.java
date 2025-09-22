package ClassPractice.SortingAlgorithm.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionOptimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int minIndex = i;
            for(int j = i+1;j< arr.length;j++)
            {
                if(arr[minIndex]>arr[j])
                {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
