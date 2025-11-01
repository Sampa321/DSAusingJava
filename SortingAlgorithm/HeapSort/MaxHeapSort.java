package ClassPractice.SortingAlgorithm.HeapSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxHeapSort {
    int []heap;
    int capacity;
    int size;
    MaxHeapSort(int c)
    {
        this.heap = new int[c];
        this.capacity = c;
        this.size = 0;
    }
    //For insert
    void insert(int element)
    {
        if(this.capacity == this.size)
        {
            System.out.println("Heap full");
            return ;
        }
        heap[size++]=element;
        heapifyUp(element);
    }
    int parent(int i)
    {
        return (i-1)/2;
    }
    void swap(int l,int r)
    {
        int temp = heap[l];
        heap[l]=heap[r];
        heap[r]=temp;
    }
    void heapifyUp(int ele)
    {
        int i=size-1;
        while (i!=0 && this.heap[parent(i)]<ele)
        {
            swap(i,parent(i));
            i=parent(i);
        }
    }

    //For delete
    void delete()
    {
        if(this.size==0)
        {
            System.out.println("Heap is empty!");
            return;
        }
        swap(0,size-1);
        size--;
        heapifyDown(0);
    }
    int leftChild(int i)
    {
        return (2*i+1);
    }
    int rightChild(int i)
    {
        return (2*i+2);
    }
    void heapifyDown(int i){
        int largestElementIndex=i;
        int lcIndex=leftChild(i);
        int rcIndex=rightChild(i);
        if(lcIndex<size && heap[lcIndex]>heap[i])
        {
            largestElementIndex=lcIndex;
        }
        if(rcIndex<size && heap[rcIndex]>heap[largestElementIndex])
        {
            largestElementIndex=rcIndex;
        }
        if(largestElementIndex!=i)
        {
            swap(i,largestElementIndex);
            heapifyDown(largestElementIndex);
        }
    }
    void showHeap()
    {
        System.out.println(Arrays.toString(heap));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of heap:");
        int capacity=sc.nextInt();
        MaxHeapSort h1 = new MaxHeapSort(capacity);
        h1.insert(23);
        h1.insert(67);
        h1.insert(56);
        h1.insert(90);
        h1.insert(45);
        h1.showHeap();
        //insert==delete(Ascending order)
        h1.delete();
        h1.delete();
        h1.delete();
        h1.delete();
        h1.delete();
        h1.showHeap();
    }
}
