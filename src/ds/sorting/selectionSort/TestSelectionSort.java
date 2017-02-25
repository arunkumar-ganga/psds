package ds.sorting.selectionSort;

import java.util.Random;

/**
 * Created by arun.kumarg on 22/10/16.
 */
public class TestSelectionSort {

  public static void printArray(int[] input){

    for(int i=0; i <input.length-1;i++ ){
      System.out.print(input[i]+" ");
    }
  }

  public static void main(String[] args) {

    SelectionSort selectionSort = new SelectionSort();
    int size = 100000;
    int[] inputArray = new int[size];
    int[] resultArray;

    Random rand = new Random();

    for(int i=0; i<size ; i++){
      inputArray[i] = rand.nextInt(size) + 1;
    }

    System.out.println("Input array:");
    printArray(inputArray);


    long startTime = System.currentTimeMillis();
    resultArray = selectionSort.sort(inputArray);
    long endTime = System.currentTimeMillis();
    long timeTaken = endTime-startTime;

    System.out.println("\nSorted array");
    printArray(resultArray);

    System.out.println("\nTotal time taken: " +timeTaken +"");

  }

}
