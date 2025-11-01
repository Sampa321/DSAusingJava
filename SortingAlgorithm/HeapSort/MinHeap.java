package ClassPractice.SortingAlgorithm.HeapSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MinHeap {
    int []heap;
    int capacity;
    int size;
    MinHeap(int c)
    {
        this.heap =new int [c];
        this.capacity = c;
        this.size = 0;
    }
    //For insert elements
    void insert(int element)
    {
        if(this.size==this.capacity)
        {
            System.out.println("Bhai! heap full!");
            return;
        }
        heap[size++]=element;
        this.heapifyUp(element);
    }
    int parent(int i)
    {
        return (i-1)/2;
    }
    void swap(int l,int h)
    {
        int temp = heap[l];
        heap[l]=heap[h];
        heap[h]=temp;
    }
    void heapifyUp(int element)
    {
        int i=size-1;
        while(i!=0 && (this.heap[this.parent(i)]>element ))
        {
            this.swap(parent(i),i);
            i=parent(i);
        }
    }
    void show()
    {
        System.out.println("your heap look likes this :"+Arrays.toString(heap));
    }
    //For delete elements
    int delete()
    {
        if(this.size==0)
        {
            System.out.println("Heap is empty!");
            return Integer.MIN_VALUE;
        }
        int min = this.heap[0];
        swap(0,size-1);
        size--;
        this.heapifyDown(0);
        return min;
    }
    int leftChild(int i)
    {
        return (2*i+1);
    }
    int rightChild(int i)
    {
        return (2*i+2);
    }
    void heapifyDown(int index){
        int leftIndex=this.leftChild(index);
        int rightIndex=this.rightChild(index);
        int smallestIndex=index;
        if(leftIndex<size && (this.heap[leftIndex]<this.heap[index]))
        {
            smallestIndex=leftIndex;
        }
        if (rightIndex<size && (this.heap[rightIndex]<this.heap[smallestIndex]))
        {
            smallestIndex=rightIndex;
        }
        if(smallestIndex!=index)
        {
            swap(index,smallestIndex);
            heapifyDown(smallestIndex);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of heap : ");
        int capacity = sc.nextInt();
        MinHeap h1 = new MinHeap(capacity);
        h1.insert(78);
        h1.insert(89);
        h1.insert(33);
        h1.insert(56);
        h1.show();
        System.out.println("Deleted element is :");

        System.out.println(h1.delete());
        System.out.println(h1.delete());
        System.out.println(h1.delete());
        h1.show();
    }
}
