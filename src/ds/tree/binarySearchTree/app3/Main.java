package ds.tree.binarySearchTree.app3;

/**
 * Created by arun.kumarg on 24/10/16.
 */
public class Main {

  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(3);
    tree.insert(8);
    tree.insert(1);
    tree.insert(4);
    tree.insert(6);
    tree.insert(2);
    tree.insert(10);
    tree.insert(9);
    tree.insert(20);
    tree.insert(25);
    tree.insert(15);
    tree.insert(16);

    System.out.println("InOrder.. ");
    tree.printInOrder();

    System.out.println("\n\nPreOrder.. ");
    tree.printPreOrder();

    System.out.println("\n\nPostOrder.. ");
    //tree.printPostOrder();
  }

}
