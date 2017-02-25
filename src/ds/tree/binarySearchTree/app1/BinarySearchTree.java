package ds.tree.binarySearchTree.app1;

/**
 * Created by arun.kumarg on 17/07/16.
 */
public class BinarySearchTree {

  private Node root;

  private Node insertkey(Node node, int key){
    if(node == null){
      node = new Node(key);
    }else if(key > node.getKey()){
      node.right = insertkey(node.right, key);
    }else{
      node.left = insertkey(node.left, key);
    }

    return node;
  }

  public void insert(int key){
    root = insertkey(root,key);
  }

  private void inOrder(Node node){
    if(node == null){
      return;
    }else{
      inOrder(node.left);
      System.out.print(node.getKey()+" ");
      inOrder(node.right);
    }
  }
  public void printInOrder(){
    inOrder(root);
  }

  private void preOrder(Node node){
    if(node == null){
      return;
    }else{
      System.out.print(node.getKey()+" ");
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  public void printPreOrder(){
    preOrder(root);
  }

  private void postOrder(Node node){
    if(node == null){
      return;
    }else{
      postOrder(node.left);
      postOrder(node.right);
      System.out.print(node.getKey()+" ");
    }
  }

  public void printPostOrder(){
    postOrder(root);
  }
}
