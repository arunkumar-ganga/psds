package ds.tree.binarySearchTree.app4_isBST;


/**
 * Created by arun.kumarg on 17/07/16.
 */
public class Main {

  public static void main(String[] args) {

    BinarySearchTree tree = new BinarySearchTree();
    tree.root = new Node(3);
    tree.root.left = new Node(2);
    tree.root.right = new Node(5);
    tree.root.left.left = new Node(1);
    tree.root.left.right = new Node(4);

    System.out.print(tree.checkBST());

    tree = new BinarySearchTree();
    tree.root = new Node(3);

  }

}

// 2 3 4 6 8 9 10 15 16 20 25 100