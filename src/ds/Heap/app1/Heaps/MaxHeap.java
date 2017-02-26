package ds.Heap.app1.Heaps;

/**
 * Created by arun.kumarg on 26/02/17.
 */
public class MaxHeap {

    private int capacity;
    public int size;
    private int[] heap_array;

    public MaxHeap(int capacity){
        this.capacity = capacity;
        this.size =0;
        heap_array = new int[capacity];
    }

    private int getParent(int i){
        return i >= 0 && i <this.size  ? (i-1)/2 : -1;
    }

    private int getLeftChild(int i){
        int left = (2*i) + 1;
        return left >= this.size ? -1 : left;
    }

    private int getRightChild(int i){
        int right = (2*i) + 2;
        return right >= this.size ? -1 : right;
    }

    private void heapifyUp(int i){
        int parent = getParent(i);

        if(parent >-1 && heap_array[i] > heap_array[parent]){
            int temp = heap_array[i];
            heap_array[i] = heap_array[parent];
            heap_array[parent] = temp;
            heapifyUp(parent);
        }
    }

    private void heapifyDown(int i){
        int left = getLeftChild(i);
        int right = getRightChild(i);
        int max = i;


        if(left != -1 && heap_array[left] > heap_array[max]){
            max = left;
        }

        if(right != -1 && heap_array[max] < heap_array[right]){
            max = right;
        }

        if(max != i){
            int temp = heap_array[i];
            heap_array[i] = heap_array[max];
            heap_array[max] = temp;
            heapifyDown(max);
        }

    }

    public void insert(int data) throws Exception{
        if(size+1 >= capacity){
            throw new Exception("Heap full");
        }else{
            heap_array[size++] = data;
            heapifyUp(size -1);
        }
    }

    public int pop(){
        if(size >=0){
            size --;
            return heap_array[0];
        }else{
            return Integer.MIN_VALUE;
        }
    }

    public void sort(){
        int n = size;
        for(int i=0; i<n-1; i++){
            int ele = pop();
            if(ele != Integer.MIN_VALUE){
                heap_array[0] = heap_array[n-i-1];
                heap_array[n-i-1] = ele;
                heapifyDown(0);
            }
        }
    }

    public void print() {
        for(int i=0; i< heap_array.length; i++){
            System.out.print(heap_array[i]+" ");
        }
    }
}
