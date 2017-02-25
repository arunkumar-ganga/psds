package ds.tree.binarySearchTree.app4_isBST;

/**
 * Created by arun.kumarg on 17/07/16.
 */
public class BinarySearchTree {

  public Node root;
  private int lastAccessed = Integer.MIN_VALUE;

  public boolean checkBST() {

    return checkBST(root);

  }

  private boolean checkBST(Node node) {
    if (node != null) {
      if(!checkBST(node.left)){
        return false;
      }
      System.out.print(node.getKey()+" ");
        if(lastAccessed <= node.getKey()){
          lastAccessed = node.getKey();
        }else{
          return false;
        }
      if(!checkBST(node.right)){
        return false;
      }
    }
    return true;
  }

  /*
 private int lastAccessed = Integer.MIN_VALUE;

  boolean checkBST() {
    return check(root);
  }

  private boolean check(Node node) {
    if (node != null) {
      check(node.left);
      if(lastAccessed <= node.getKey()){
        lastAccessed = node.getKey();
      }else{
        return false;
      }
      check(node.right);
    }
    return true;
  }

*/
}
