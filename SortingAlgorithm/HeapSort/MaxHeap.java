package ClassPractice.SortingAlgorithm.HeapSort;
import java.util.Scanner;
import java.util.Arrays;
public class MaxHeap {
    int [] heap;
    int capacity;
    int size;

    MaxHeap(int c) {
        this.heap = new int[c];
        this.capacity = c;
        this.size = 0;
    }
    void swap(int l, int r) {
        int temp = this.heap[l];
        this.heap[l] = this.heap[r];
        this.heap[r] = temp;
    }

    int parent(int i) {
        return (i-1)/2;
    }

    int leftChild(int i) {
        return 2*i+1;
    }

    int rightChild(int i) {
        return 2*i + 2;
    }

    void insert(int element) {
        // check if heap is full or not.
        if(this.size == capacity) {
            System.out.println("Bhai, heap full!");
            return;
        }
        this.heap[size] = element;
        size++;
        this.heapifyUp(element);
    }

    void heapifyUp(int element) {
        int i = size - 1;   // tracks the element's position which is not at it's correct position.
        while(this.heap[this.parent(i)] < element && i != 0) {
            this.swap(i, this.parent(i));
            i = this.parent(i);
        }
    }

    int getMax() {
        if(size == 0) {
            System.out.println("Bhai, Heap faka!, tobhu toke ami maximum value debo. Khush thak! tui o ki mone rakhbi.");
            return Integer.MAX_VALUE;
        }
        int max = this.heap[0];
        this.swap(0, this.size-1);
        size--;
        heapifyDown(0);
        return max;
    }

    void heapifyDown(int i) {
        int largestElementIndex = i;
        int lcIndex = this.leftChild(i);
        int rcIndex = this.rightChild(i);
        if(lcIndex < size && this.heap[lcIndex] > this.heap[i]) {
            largestElementIndex = lcIndex;
        }
        if(rcIndex < size && this.heap[rcIndex] > this.heap[largestElementIndex]) {
            largestElementIndex = rcIndex;
        }

        if(largestElementIndex != i) {
            swap(largestElementIndex, i);
            heapifyDown(largestElementIndex);
        }
    }

    void showHeap(){
        System.out.println("Your heap looks like this : " + Arrays.toString(this.heap));
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity of heap : ");
        int c = sc.nextInt();
        MaxHeap h1 = new MaxHeap(c);
        h1.insert(30);
        h1.insert(31);
        h1.insert(10);
        h1.insert(25);
        h1.insert(50);
        h1.insert(35);

        h1.showHeap();

        h1.getMax();
        h1.getMax();
        h1.getMax();
        h1.showHeap();
        System.out.println("Size of heap right now : " + h1.size);
    }
}
