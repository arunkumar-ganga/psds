package ds.linkedlist.singlyLinkedList;

/**
 * Created by arun.kumarg on 20/07/16.
 */
public class Node {
  private int key;
  private Node next;

  public Node(int item) {
    key = item;
    next = null;
  }

  public Node getNext(){
    return next;
  }

  public void setNext(Node node){
    next = node;
  }


  public int getKey(){
    return this.key;
  }

}
