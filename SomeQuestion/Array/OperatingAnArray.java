package HomePractice.GeeksForGeeks.Arrays;

/*
Given an array arr, complete the following three functions:
searchEle: This function searches for an element x in the array arr. It should return a boolean value - true if the element is found, and false otherwise.
insertEle: This function inserts an element y at index yi in the array. true will be printed if the insertion is done correctly, and false otherwise.
deleteEle: This function deletes the first occurrence of an element z in the array. true will be printed if the deletion is done correctly, and false otherwise.

 Note: 0-based indexing is followed.

Example:

Input: arr[] = [2, 4, 1, 0, 2], x=1, y=2, yi=2, z=0
Ouput: true true true
Explanation: As x=1 is present in the array, so return 1. After inserting y=2 at yi=2th index, the array becomes 2,4,2,1,0,2. After deleting z=0, the array becomes 2,4,2,1,2
Input: arr[] = [17, 15, 8, 9, 12], x=10, y=6, yi=2, z=5
Ouput: false true false
Explanation: As x=10 is not present in the array, so return 0. After inserting y=6 at yi=2th index, the array becomes 17,15,6,8,9,12. As z=5 not present, the arrays stays as 17,15,6,8,9,12.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperatingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n =sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the arrayList elements:");
        for(int i=0;i<n;i++)
        {
            int ele =sc.nextInt();
            list.add(ele);
        }
        System.out.print("Enter the search element:");
        int search = sc.nextInt();
        boolean searchCheck = searchEle(list,search);
        System.out.println(searchCheck);

        System.out.print("Enter the position you can add element:");
        int indexAddElement =sc.nextInt();
        System.out.print("Enter the element you want to add:");
        int addElement = sc.nextInt();
        boolean checkAddElement = insertEle(list,addElement,indexAddElement);
        System.out.println(checkAddElement);

        System.out.println("Enter the element you want to deleted:");
        int deleteElement = sc.nextInt();
        boolean checkDelete = deleteEle(list,deleteElement);
        System.out.println(checkDelete);
    }
    public static boolean searchEle(List<Integer> arr, int x) {
        // add code here.
        for(int ele:arr)
        {
            if(ele==x)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean insertEle(List<Integer> arr, int y, int yi) {
        // add code here.
        arr.add(y);
        int n=arr.size()-1;
        boolean flag =false;
        while(n>0 && yi<n)
        {
            int temp = arr.get(n);
            arr.set(n,arr.get(n-1));
            arr.set(n-1,temp);
            n--;
            flag = true;
        }
        return flag;
    }

    public static boolean deleteEle(List<Integer> arr, int z) {
        // add code here.
        int j=-1;
        boolean check =false;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==z)
            {
                j=i;
                check = true;
                break;

            }
        }
        if(j>=0)
        {
            for(int i=j;i<arr.size()-1;i++)
            {
                arr.set(i,arr.get(i+1));
            }
            arr.remove(arr.size()-1);
        }
        return check;
    }
}
