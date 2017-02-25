package ds.linkedlist.singlyLinkedList;

/**
 * Created by arun.kumarg on 20/07/16.
 */
public class SinglyLinkedList {
  Node head;

  public void insert(int key){
    head = insert(head,key);
  }

  private Node insert(Node node, int key){

    if(node == null){
      node = new Node(key);
      return node;
    }else {
      Node newNode = new Node(key);
      newNode.setNext(node);
      return newNode;
    }

  }

  public int remove(){
    Node node = remove(head);
    return node.getKey();
  }

  private Node remove(Node node){
    if(node != null){
      head = node.getNext();
      node.setNext(null);

    }
    return node;
  }

  public String toString(){
    String string = "[";

    Node node = head;
    while (node != null){
      string = string+node.getKey() + ", ";
      node = node.getNext();
    }

    string = string + "]";

    return string;
  }

}
