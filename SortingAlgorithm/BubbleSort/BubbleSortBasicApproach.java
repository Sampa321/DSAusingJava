package ClassPractice.SortingAlgorithm.BubbleSort;

import java.util.Arrays;

public class BubbleBasicApproach {
    public static void main(String[] args) {
        int []arr = {12,4,67,56,34,9,3,3};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j< arr.length-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
