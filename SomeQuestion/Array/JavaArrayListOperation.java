package HomePractice.GeeksForGeeks.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

/*
Given an ArrayList of lowercase characters initially empty. You are given queries of two types to perform on ArrayList:
    'i' and 'c': append character 'c' in the ArrayList.
    'f' and 'c': find the frequency of character 'c' in ArrayList, if not present then print -1.

Note: use add() to append an element to the list and contains() to check whether an element is present or not in the list and Collections.frequency() to find the frequency of the element in the list.

Examples:

Input: i g i e i e i k i s f e
Output: 2
Explanation: Inserting g, e, e, k, s into the list. The frequency of e is 2 in the list.
Input: i c i p i p f f
Output: -1
 */
public class JavaArrayListOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrayList size:");
        int n = sc.nextInt();
        ArrayList<Character> list = new ArrayList<Character>();
        System.out.println("Enter the arrayList element:");
        for(int i=0;i<n;i++)
        {
            char ch=sc.next().charAt(0);
            insert(list,ch);

        }
        System.out.print("Enter the character which frequency you want to count: ");
        char searchCharacter = sc.next().charAt(0);
        freq(list,searchCharacter);
    }
    public static void insert(ArrayList<Character> clist, char c) {
        // your code
        clist.add(c);
    }

    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c) {
        // your code
        int freq=0;
        boolean flag =false;
        for(char ch:clist)
        {
            if(ch==c)
            {
                flag = true;
                freq++;
            }
        }
        if(flag)
        {
            System.out.println(freq);
        }
        else
        {
            System.out.println("-1");
        }
    }
}
