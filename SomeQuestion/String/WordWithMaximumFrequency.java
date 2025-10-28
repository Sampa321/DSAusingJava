package HomePractice.GeeksForGeeks.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
ou are given a string s that is made up of words separated by spaces. Your task is to find the word with the highest frequency, i.e. it appears the most times in the sentence. If multiple words have maximum frequency, then print the word that occurs first in the sentence.

Examples:

Input: s = "the devil in the sky"
Output: "the 2"
Explanation: The frequency of "the" is 2, so we return "the" and its frequency "2" i.e., "the 2"
Input: s = "this is not right"
Output: "this 1"
Explanation: Every word has the frequency of "1", so we return "this 1" as this occurs first in the sentence.
 */
public class WordWithMaximumFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Maximum element and frequency : "+maximumFrequency(str));
    }
    public static String maximumFrequency(String s) {
        // Your Code goes here
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        String []arr=s.split(" ");
        int max=1;
        String maxi=arr[0];
        for(String ele:arr)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(Map.Entry<String,Integer>ele:map.entrySet())
        {
            if(ele.getValue()>max)
            {
                max=ele.getValue();
                maxi=ele.getKey();
            }
        }
        return maxi+" "+max;
    }
}
