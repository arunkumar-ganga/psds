package ds.sorting.selectionSort;

/**
 * Created by arun.kumarg on 22/10/16.
 */
public class SelectionSort {


  public int[] sort(int[] inputArray){
      for(int i=0; i<inputArray.length-2;i++){
        for(int j=0; j<inputArray.length-1; j++){
          if(inputArray[i]> inputArray[j]){
            int temp = inputArray[i];
            inputArray[i] = inputArray[j];
            inputArray[j] = temp;
          }
        }
      }
    return inputArray;
  }

}
