package ClassPractice.SortingAlgorithm.MergeSortSolution;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortOptimizationApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        int l=0;
        int r=n-1;
        MergeSort(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }
    public static void MergeSort(int []arr,int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            MergeSort(arr,l,mid);
            MergeSort(arr,mid+1,r);
            Merge(arr,l,mid,r);
        }
    }
    public static void Merge(int []arr,int l,int m,int r) {
        int[] temp = new int[r - l + 1];
        int i = l;
        int j = m + 1;
        int k = 0;
        while (i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= m) {
            temp[k++] = arr[i++];
        }
        while ((j <= r)) {
            temp[k++] = arr[j++];
        }
        for(i=l;i<=r;i++)
        {
            arr[i]=temp[i-l];
        }
    }
}
