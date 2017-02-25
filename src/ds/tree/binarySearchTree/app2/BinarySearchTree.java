package ds.tree.binarySearchTree.app2;

import java.util.Stack;

/**
 * Created by arun.kumarg on 21/10/16.
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

    Node currentNode = root;
    Stack traversal = new Stack();

    while (currentNode != null){
      traversal.push(currentNode);
      currentNode = currentNode.left;
    }

    while(!traversal.isEmpty()){

      currentNode = (Node) traversal.pop();
      System.out.print(currentNode.key+" ");

      if(currentNode.right != null){
        currentNode = currentNode.right;
        while (currentNode != null){
          traversal.push(currentNode);
          currentNode = currentNode.left;
        }
      }

    }
  }

  public void printPreOrder(){
    if(null == root){
      return;
    }

    Node currentNode = root;
    Stack traversal = new Stack();

    while (currentNode != null){
      traversal.push(currentNode);
      System.out.print(currentNode.key+" ");
      currentNode = currentNode.left;
    }

    while(!traversal.isEmpty()){

      currentNode = (Node) traversal.pop();

      if(currentNode.right != null){
        currentNode = currentNode.right;
        while (currentNode != null){
          traversal.push(currentNode);
          System.out.print(currentNode.key+" ");
          currentNode = currentNode.left;
        }
      }

    }
  }

  public void printPostOrder(){
    if(null == root){
      return;
    }

    Node currentNode = root;
    Stack<Node> traversal = new Stack();
    Stack<Integer> s = new Stack();

    while (currentNode != null){
      traversal.push(currentNode);
      currentNode = currentNode.left;
    }

    while(!traversal.isEmpty()){

      currentNode = traversal.pop();
      s.push(currentNode.getKey());

      if(currentNode.right != null){
        Node node = currentNode.right;

        while (node != null){
          traversal.push(node);
          node = node.left;

        }
      }
    }
    System.out.print(s);
  }

}
