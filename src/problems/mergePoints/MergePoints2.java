package problems.mergePoints;

import java.util.Scanner;

/**
 * Created by arun.kumarg on 23/02/17.
 */
public class MergePoints2 {


  private static int partition(int[][] input, int start, int end){
    int pivot = input[end][0];
    int partitionIndex = start;

    for(int i=start; i<end;i++){
      if(input[i][0] < pivot){
        int temp = input[partitionIndex][0];
        input[partitionIndex][0] = input[i][0];
        input[i][0] = temp;

        temp = input[partitionIndex][1];
        input[partitionIndex][1] = input[i][1];
        input[i][1] = temp;
        partitionIndex++;
      }
    }


    int temp = input[partitionIndex][0];
    input[partitionIndex][0] = input[end][0];
    input[end][0] = temp;

    temp = input[partitionIndex][1];
    input[partitionIndex][1] = input[end][1];
    input[end][1] = temp;

    return partitionIndex;
  }

  private static void qSort(int[][] inputArray, int start, int end){
    if(start < end){
      int partitionIndex = partition(inputArray,start,end);
      qSort(inputArray,start,partitionIndex-1);
      qSort(inputArray,partitionIndex+1,end);
    }

  }

  public static void sort(int[][] inputArray){

     qSort(inputArray, 0, inputArray.length-1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] input = new int[n][2];

    for(int i=0; i< n; i++){
      input[i][0] = sc.nextInt();
      input[i][1] = sc.nextInt();
    }

    sort(input);

    int x=input[0][0],y=input[0][1];

    for(int i=0; i< n-1; i++){
     if(x <= input[i+1][0] && y >= input[i+1][0]){
         y=input[i+1][1];
     }else{
        System.out.println(x + "," + y);
        x = input[i+1][0];
        y = input[i+1][1];
     }
    }

    System.out.println(x + "," + y);

  }

}
