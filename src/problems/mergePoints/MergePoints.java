package problems.mergePoints;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by arun.kumarg on 23/02/17.
 */
public class MergePoints {

  public static void main(String[] args) {
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

    Scanner sc = new Scanner(System.in);

    for(int i=0; i< 5; i++){
      int x=sc.nextInt(); int y=sc.nextInt();
      int key=0;
      boolean found = false;

        if(map.size() ==0){
          map.put(x,y);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
          if(x>=entry.getKey() && x<=entry.getValue()){
            key = entry.getKey();
            found = true;
            break;
          }
        }
        if(found){
          map.put(key, y);
        }else{
          map.put(x,y);
        }
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet())
    {
      System.out.println(entry.getKey()+","+entry.getValue());
    }

  }

}
