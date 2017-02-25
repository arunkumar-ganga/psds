package problems.codechef.train;

/**
 * Created by arun.kumarg on 10/12/16.
 */
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String[] results = new String[size];

    HashMap berths = new HashMap();
    berths.put(1, "LB");
    berths.put(2, "MB");
    berths.put(3, "UB");
    berths.put(4, "LB");
    berths.put(5, "MB");
    berths.put(6, "UB");
    berths.put(7, "SU");
    berths.put(0, "SL");

    for(int i=0; i<size; i++){
      int input = sc.nextInt();

      int reminder = input%8;

      if(reminder == 0){
        results[i] = input-1+""+berths.get(reminder);
      }else if(reminder == 7){
        results[i] = input+1+""+berths.get(reminder);
      }else if(reminder <4 ){
        results[i] = input+3+""+berths.get(reminder);
      }else{
        results[i] = input-3+""+berths.get(reminder);
      }

      }

    for(int i=0; i<size; i++){
      System.out.println(results[i]);
    }
    }

  }
