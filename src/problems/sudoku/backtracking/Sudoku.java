package problems.sudoku.backtracking;

/**
 * Created by arun.kumarg on 21/11/16.
 */
public class Sudoku {

  int[][] array ;

  public Sudoku(int[][] array) {
    this.array = array;
  }

  public  boolean isFound(int[][] arr, int row, int rowLength, int col, int colLength, int num){

    for(int i=row; i<rowLength; i++){
      for(int j=col; j<colLength; j++){
        if(arr[i][j] == num){
          return true;
        }
      }
    }
    return false;
  }

  public  boolean foundInRow(int[][] array, int row, int n){
    for(int i=0; i<9; i++){
        if(array[row][i] == n)
          return true;
    }
    return false;
  }


  public  boolean foundInCol(int[][] array, int col, int n){
    for(int i=0; i<9; i++){
      if(array[i][col] == n)
        return true;
    }
    return false;
  }



  public  boolean foundInSquare(int[][] array, int row, int col, int n){
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        if(array[i+row][j+col] == n)
          return true;
      }
    }
    return false;
  }



  public boolean isSafe(int row, int col, int n){

    //boolean foundInRow = isFound(array, 0, array.length, col, col+1, n);
    //boolean foundIncol = isFound(array, row, row + 1, 0, array[0].length, n);

    boolean foundInRow = foundInRow(array, row, n);
    boolean foundIncol = foundInCol(array, col, n);

    row = row - row%3;
    col = col - col%3;
    boolean foundInSquare = foundInSquare(array, row, col, n);

    if(foundInRow || foundIncol || foundInSquare){
      return false;
    }

    return true;
  }

  public boolean isEmpty(int row, int col){

    if(array[row][col] == 0){
        return true;
    }

    return false;
  }

  public boolean solve(){

    int row =0;
    boolean found = false;
    int col =0;

    for(; row < array.length; row++) {
      for (col =0; col < array[row].length; col++) {
        if(array[row][col] == 0){
          found =true;
          break;
        }
      }
      if(found){
        break;
      }
    }

    if(row ==9 && col ==9){
      System.out.print("End");
      System.out.println(row + " " + col);
      return true;
    }

    for(int n=1; n <10; n++){

        if(isSafe(row, col, n)){
          array[row][col] = n;
          if(solve()){
            return true;
          }else{
            array[row][col] = 0;
          }
        }
    }

    return false;
  }



  public void print() {

    for(int i=0; i<array.length; i++) {

      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j]+" ");
      }
      System.out.print("\n");
    }
  }
}
