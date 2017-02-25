package ds.arrays.problem1;

import java.util.Scanner;

/**
 * Created by arun.kumarg on 23/11/16.
 */
public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for(int i=0; i<n; i++){
      a[i] =sc.nextInt();
    }

    for(int i=n-1; i>=0; i--){
      System.out.print(a[i]+" ");
    }
  }
}
