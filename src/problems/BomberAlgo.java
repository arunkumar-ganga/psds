package problems;


import java.util.Scanner;
import java.util.ArrayList;

public class BomberAlgo{

  public static void main(String[] args){

    ArrayList<Character> al = new ArrayList<Character>();
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();


    char[] charArray = input.toCharArray();

    for(int i=0; i<charArray.length; i++){
      al.add(charArray[i]);
      int alSize = al.size();
      if(alSize >=3){
        if(al.get(alSize-1) == al.get(alSize-2) && al.get(alSize-1) == al.get(alSize-3)){
          al.remove(alSize-1);
          al.remove(alSize-2);
          al.remove(alSize-3);
        }
      }
    }

    for(int i=0; i<al.size(); i++){
      System.out.print(al.get(i));
    }


  }

}