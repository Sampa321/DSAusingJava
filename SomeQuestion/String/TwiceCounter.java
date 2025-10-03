package HomePractice.GeeksForGeeks.String;

import java.util.HashMap;
import java.util.Scanner;

/*
Given a list of N words. Count the number of words that appear exactly twice in the list.

Example 1:

Input:
N = 3
list = {Geeks, For, Geeks}
Output: 1
Explanation: 'Geeks' is the only word that
appears twice.
Example 2:

Input:
N = 8
list = {Tom, Jerry, Thomas, Tom, Jerry,
Courage, Tom, Courage}
Output: 2
Explanation: 'Jerry' and 'Courage' are the
only words that appears twice.
 */
public class TwiceCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length:");
        int n=sc.nextInt();
        String []arr = new String[n];
        System.out.println("Enter the array list of string:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.next();
        }
        System.out.println("No of twice word :"+countWords(arr,n));
    }
    public static int countWords(String list[], int n) {
        // code here
        int ans=0;
        HashMap<String,Integer> map = new HashMap<>();
        for(String x:list)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(String y:map.keySet())
        {
            if(map.get(y)==2)
            {
                ans++;
            }
        }
        return ans;
    }
}
