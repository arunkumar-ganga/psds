package ds.search.binarysearch.app1;

/**
 * Created by arun.kumarg on 19/10/16.
 */
public class BinarySearch {

  public boolean search(int[] inputArray, int searchKey){
    boolean found = false;
    int length = inputArray.length;
    int start = 0;
    int end = length-1;


    while (start < end){

      int middle = (start+ end +1)/2;
      System.out.println("Start = " + start + " End = " + end + " Middle =" +middle );
      if(inputArray[middle] == searchKey){
        found = true;
        break;
      }else if(searchKey > inputArray[middle]){
        start = middle+1;
      }else{
        end = middle-1;
      }
    }

    return found;
  }

  public boolean search2(int[] inputArray, int searchKey){
    boolean found = false;
    int length = inputArray.length;
    int start = 0;
    int end = length -1;

    while (start<=end){ // change from search method
      int middle = Math.round((start + end) /2) ; // change from search method

      System.out.println("Start = " + start + " End = " + end + " Middle =" +middle );

      if(searchKey == inputArray[middle]){
        found = true;
        break;
      }else if (searchKey > inputArray[middle]){
        start = middle +1;
      }else{
        end = middle -1;
      }
    }
    return found;
  }

}
