package problems.codechef.KiritoInLabyrinth;

/**
 * Created by arun.kumarg on 10/12/16.
 */
import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static int gcd(int n1, int n2){
    int r;

    while(n2 != 0)
    {
      r = n1 % n2;
      n1 = n2;
      n2 = r;
    }

    return n1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1;
    int n2;
    int inputSize;
    int result = 0;
    int testSize = sc.nextInt();

    for (int i = 0; i < testSize; i++) {
      inputSize = sc.nextInt();
      n1 =0;
      n2 =0;
      boolean found = false;
      result =0;

      int j=0;

      if(j<inputSize) {
          n1 = sc.nextInt();
          j++;
      }

      if(j<inputSize){
          n2 = sc.nextInt();
          j++;
      }

      if(gcd(n1,n2) > 1){
        result++;
      }
      n1=n2;

      while(j<inputSize){
        n2 = sc.nextInt();

        if(gcd(n1,n2) > 1){
            result++;
            n1=n2;
        }
        j++;
      }

      System.out.println(result+1);
    }

  }

}
