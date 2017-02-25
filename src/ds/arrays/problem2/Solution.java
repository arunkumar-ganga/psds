package ds.arrays.problem2;

import java.util.Scanner;

/**
 * Created by arun.kumarg on 23/11/16.
 */
public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int max = -99;

    int[][] a = new int[6][6];


    for(int i=0; i<6; i++){
      for(int j=0; j<6; j++){
        //a[i][j] = sc.nextInt();
        int n = sc.nextInt();
        if(-9<=n || n>=9){
          a[i][j] = n;
        }else{
          new Exception("Wrong input");
        }
      }
    }

    for(int i=0; i<4; i++){
      for(int j=0; j<4; j++){
        int result = a[i][j] + a[i][j+1] + a[i][j+2] +
                              a[i+1][j+1] +
                     a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];

        if(result > max){
          max = result;
        }
      }
    }

    System.out.print(max);
  }
}
