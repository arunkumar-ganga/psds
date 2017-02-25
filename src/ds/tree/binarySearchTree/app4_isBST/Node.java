package ds.tree.binarySearchTree.app4_isBST;

/**
 * Created by arun.kumarg on 17/07/16.
 */
public class Node {

  int key;
  Node left, right;

  public Node(int item) {
    key = item;
    left = right = null;
  }

  int getKey(){
    return this.key;
  }

}
