package problems.sudoku.backtracking;

/**
 * Created by arun.kumarg on 21/11/16.
 */
public class Main {

  public static void main(String[] args) {
    int[][] input = new int[][] { {3,0,0,5,0,8,4,0,0},
                                  {0,2,0,0,0,0,0,0,0},
                                  {0,8,7,0,0,0,0,3,1},
                                  {0,0,3,0,1,0,0,8,0},
                                  {9,0,0,8,6,3,0,0,5},
                                  {0,5,0,0,9,0,6,0,0},
                                  {1,3,0,0,0,0,2,5,0},
                                  {0,0,0,0,0,0,0,7,4},
                                  {0,0,5,2,0,6,3,0,0}
                                };

    int[][] input1 = new int[][] { {6,0,0,0,0,8,9,4,0},
                                  {9,0,0,0,0,6,1,0,0},
                                  {0,7,0,0,4,0,0,0,0},
                                  {2,0,0,6,1,0,0,0,0},
                                  {0,0,0,0,0,0,2,0,0},
                                  {0,8,9,0,0,2,0,0,0},
                                  {0,0,0,0,6,0,0,0,5},
                                  {0,0,0,0,0,0,0,3,0},
                                  {8,0,0,0,0,1,6,0,0}
    };

    Sudoku su = new Sudoku(input1);

    long start = System.currentTimeMillis();
    System.out.println(su.solve());
    long end = System.currentTimeMillis();
    System.out.println(end-start);
    su.print();

  }

}
