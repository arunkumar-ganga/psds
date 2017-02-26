package ds.Heap.app1.Heaps;

/**
 * Created by arun.kumarg on 26/02/17.
 */
public class TestHeap {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        try {
            heap.insert(20);
            heap.insert(2);
            heap.insert(57);
            heap.insert(34);
            heap.insert(68);
            heap.insert(72);
            heap.insert(89);
            heap.insert(29);
            heap.insert(11);

        } catch (Exception e) {
            e.printStackTrace();
        }

        heap.print();
        System.out.println();
        heap.sort();
        heap.print();

    }
}
