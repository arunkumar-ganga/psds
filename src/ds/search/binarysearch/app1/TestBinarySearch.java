package ds.search.binarysearch.app1;

import java.util.Scanner;

/**
 * Created by arun.kumarg on 19/10/16.
 */
public class TestBinarySearch {

  public static void printArray(int[] input){

    for(int i=0; i <input.length-1;i++ ){
      System.out.print(input[i]+" ");
    }
  }
  public static void main(String[] args){
    BinarySearch bs = new BinarySearch();
    Scanner sc = new Scanner(System.in);
    int key;
    int size;

    System.out.print("Enter size of array : ");
    size = sc.nextInt();
    int[] inputArray = new int[size];

    for(int i=0; i<size; i++){
      inputArray[i] = i+1;

    }
    printArray(inputArray);

    System.out.print("\nEnter search key : ");
    key = sc.nextInt();

    boolean result = bs.search2(inputArray, key);

    if(result)
      System.out.print("Key found");
    else
      System.out.print("Key not found");

  }

}
