package ds.arrays.FindElementInSorted2DArray;

/**
 * Created by arun.kumarg on 27/10/16.
 */
public class FindElementInSorted2DArray {

  public boolean apprach2(int[][] input, int searchKey) {
    boolean found = false;
    int m = input.length;
    if(m >0){
      int n = input[0].length;
    }

    int start = 0;
    int end = m-1;

    while (start<end){
      int middle = Math.round((start+end)/2);

      if(searchKey == input[middle][0]){

      }
    }
    return found;
  }

}
