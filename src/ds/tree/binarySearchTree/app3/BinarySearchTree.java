package ds.tree.binarySearchTree.app3;

import java.util.Stack;

/**
 * Created by arun.kumarg on 24/10/16.
 */
public class BinarySearchTree {
  Node root;

  public void insert(int key){

    Node newNode = new Node(key);

    if(null == root){
      root = newNode;
      return;
    }

    Node current = root;

    while(true){
      if(key < current.getKey()){
            if(null == current.left){
              current.left = newNode;
              return;
            }else {
              current = current.left;
            }
      }else{
            if(null == current.right){
              current.right = newNode;
              return;
            }else {
              current = current.right;
            }
      }
    }

  }


  public void printInOrder(){
    if(null == root){
      return;
    }

    Stack<Node> traversal = new Stack();

    Node node = root;
    while ( null != node){
      traversal.push(node);
      node = node.left;
    }

    while(!traversal.isEmpty()){
      Node tmp = traversal.pop();
      System.out.print(tmp.getKey() + " ");

      if( null != tmp.right){
        node = tmp.right;
        while ( null != node){
          traversal.push(node);
          node = node.left;
        }
      }
    }




  }

  public void printPreOrder(){
    if(null == root){
      return;
    }

    Stack<Node> traversal = new Stack();
    Node node = root;

    while(node != null){
      System.out.print(node.getKey() + " ");
      traversal.push(node);
      node = node.left;
    }

    while(!traversal.isEmpty()){
      Node tmp = traversal.pop();

      if(null != tmp.right){
        node = tmp.right;
        while(node != null){
          System.out.print(node.getKey() + " ");
          traversal.push(node);
          node = node.left;
        }
      }

    }
  }

  public void printPostOrder(){
    if(null == root){
      return;
    }

    Stack<Node> traversal = new Stack();

    while(!traversal.isEmpty()){
      Node currentNode = traversal.pop();
      if(currentNode.left != null){
        traversal.push(currentNode.left);
      }

      if(currentNode.right != null){
        traversal.push(currentNode.right);
      }

      traversal.push(currentNode);

      if(currentNode.left == null && currentNode.right == null){
        System.out.print(currentNode.getKey()+ " ");
        traversal.pop();
      }
    }

  }

}
