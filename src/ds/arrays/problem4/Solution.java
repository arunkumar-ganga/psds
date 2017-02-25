package ds.arrays.problem4;

import java.util.Scanner;

/**
 * Created by arun.kumarg on 30/11/16.
 */
public class Solution {


  public static void display(int[] inputArray){

    for(int i=0; i<inputArray.length; i++){
      System.out.print(inputArray[i]+" ");
    }

  }

  public static int[] approch1(int[] inputArray, int shiftLength){
    int[] tempArray = new int[shiftLength];

    for(int i=0; i<shiftLength; i++){
      tempArray[i] = inputArray[i];
    }

    for(int i=shiftLength; i<inputArray.length; i++){
      inputArray[i-shiftLength] = inputArray[i];
    }

    for(int i=inputArray.length-shiftLength, j=0; i<inputArray.length; i++, j++){
       inputArray[i] = tempArray[j];
    }

    return inputArray;
  }

  public static int[] approch2(int[] inputArray, int shiftLength){

    for(int k=0; k<shiftLength; k++){
      int temp =0;
      int arrLength = inputArray.length;
      temp = inputArray[0];

      for(int i=0; i<arrLength-1; i++){
        inputArray[i] = inputArray[i+1];
      }
      inputArray[arrLength-1] = temp;
    }


    return inputArray;
  }

  public static void approch3(int[] inputArray, int shiftLength){

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arraySize = sc.nextInt();
    int shiftLength = sc.nextInt();
    int[] inputArray = new int[arraySize];
    int[] result;
    for(int i=0; i<arraySize; i++){
      inputArray[i] = sc.nextInt();
    }

    //result = approch1(inputArray, shiftLength);
    //display(result);
    result = approch2(inputArray, shiftLength);
    display(result);
    approch3(inputArray, shiftLength);

  }
}
