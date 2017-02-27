package problems.stockspan;

import java.util.Stack;

/**
 * Created by arun.kumarg on 27/02/17.
 */
public class Stockspan {

  public static void main(String[] args) {
    int[] input = new int[]{100,60,70,65,80,85,110,90};
    int[] result = new int[input.length];
    Stack<Integer> st = new Stack<Integer>();

    for(int i=0; i<input.length; i++){
      while(st.size() >0){
        int peek = st.peek();
        if(input[peek] < input[i]){
          st.pop();
        }else{
          break;
        }
      }

      if(st.size() >0){
        result[i] = i - st.peek();
      }else{
        result[i] = i+1;
      }
      st.push(i);
    }

    for(int i=0; i<input.length; i++){
      System.out.print(result[i]+" ");
    }


  }

}
