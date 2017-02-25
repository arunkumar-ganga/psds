package ds.arrays.problem5;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by arun.kumarg on 01/12/16.
 */
public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int k;
    int q;
    int[] result;
    int n = sc.nextInt();
    HashMap<String,Integer> inputStrings = new HashMap<String, Integer>();
    String temp = "";


    for(int i=0; i<n; i++){
      temp = sc.next();
      if(inputStrings.containsKey(temp)){
        k = inputStrings.get(temp);
        k = k+1;
        inputStrings.put(temp,k);
      }else{
        inputStrings.put(temp,1);
      }
    }

    q = sc.nextInt();
    result = new int[q];

    for(int i=0; i<q; i++){
      temp = sc.next();
      if(inputStrings.containsKey(temp)){
        result[i] =  inputStrings.get(temp);
      }
    }

    for(int i=0; i<q; i++){
        System.out.println(result[i]);
    }

  }

}
