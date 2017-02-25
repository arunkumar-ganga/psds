package ds.tree.binarySearchTree.app3;

/**
 * Created by arun.kumarg on 24/10/16.
 */
public class Node {
  int key;
  Node left;
  Node right;

  public Node(int item) {
    key = item;
    left = right = null;
  }

  public int getKey(){
    return this.key;
  }
}
