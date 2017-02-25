package ds.sorting.quickSort;

import java.awt.*;
import java.util.Random;

import ds.sorting.selectionSort.SelectionSort;

/**
 * Created by arun.kumarg on 22/10/16.
 */
public class TestQuickSort {

  public static void printArray(int[] input){

    for(int i=0; i <input.length;i++ ){
      System.out.print(input[i]+" ");
    }
  }

  public static void main(String[] args) {

    QuickSort quickSort = new QuickSort();
    int size = 10;
    int[] inputArray = new int[size];

    Random rand = new Random();

    for(int i=0; i<size ; i++){
      inputArray[i] = rand.nextInt(size) + 1;
    }

    //inputArray = new int[]{6,8,3,2,1,7,5,5};
    System.out.println("Input array:");
    printArray(inputArray);


    long startTime = System.currentTimeMillis();
    quickSort.sort(inputArray);
    long endTime = System.currentTimeMillis();
    long timeTaken = endTime-startTime;

    System.out.println("\nSorted array");
    printArray(inputArray);

    System.out.println("\nTotal time taken: " +timeTaken +"");


  }

}
