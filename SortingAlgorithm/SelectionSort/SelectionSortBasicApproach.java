package ClassPractice.SortingAlgorithm.SelectionSort;

import java.util.Arrays;

public class SelectionBasicApproach {
    public static void main(String[] args) {
        int arr[] = {12,34,22,89,67,5,4,5,3};
        int []temp = new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            int tempIndex=-1;
            int min=Integer.MAX_VALUE;
            for(int j=0;j< arr.length;j++)
            {
                if(arr[j]<min)
                {
                    tempIndex = j;
                    min =arr[j];
                }
            }
            temp[index++] = min;
            arr[tempIndex] = Integer.MAX_VALUE;
        }
        System.out.println(Arrays.toString(temp));
    }
}
