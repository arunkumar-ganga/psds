package ds.sorting.mergeSort;

/**
 * Created by arun.kumarg on 22/10/16.
 */
public class mergeSort {

  private void merge(int[] input, int start, int mid, int end){
      int[] p = new int[mid-start+1];
      int[] q = new int[end-mid];

      for(int i=0; i<p.length; i++)
        p[i] = input[i+start];

      for(int i=0; i<q.length; i++)
        q[i] = input[i+mid+1];

      int i=start,j=0,k=0;

      while( j<p.length && k<q.length){
        if(p[j]<=q[k]){
          input[i] = p[j];
          j++;
        }else{
          input[i] = q[k];
          k++;
        }
        i++;
      }

      while(j< p.length){
        input[i] = p[j];
        j++;
        i++;
      }

      while(k< q.length){
        input[i] = q[k];
        k++;
        i++;
      }
  }

  private void mSort(int[] inputArray, int start, int end){

    if(start < end){
      int mid = (start+end)/2;
      mSort(inputArray,start,mid);
      mSort(inputArray,mid+1,end);
      merge(inputArray,start,mid,end);
    }
  }

  public void sort(int[] inputArray){

    mSort(inputArray, 0, inputArray.length-1);
  }

}
