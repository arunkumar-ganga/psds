package ds.sorting.quickSort;

/**
 * Created by arun.kumarg on 22/10/16.
 */
public class QuickSort {

  private int partition(int[] input, int start, int end){
    int pivot = input[end];
    int partitionIndex = start;

    for(int i=start; i<end;i++){
      if(input[i] < pivot){
        int temp = input[partitionIndex];
        input[partitionIndex] = input[i];
        input[i] = temp;
        partitionIndex++;
      }
    }


    int temp = input[partitionIndex];
    input[partitionIndex] = input[end];
    input[end] = temp;

    return partitionIndex;
  }

  private int[] qSort(int[] inputArray, int start, int end){
    if(start < end){
      int partitionIndex = partition(inputArray,start,end);
      qSort(inputArray,start,partitionIndex-1);
      qSort(inputArray,partitionIndex+1,end);
    }
    return inputArray;
  }

  public int[] sort(int[] inputArray){

    return qSort(inputArray, 0, inputArray.length-1);
  }

}
