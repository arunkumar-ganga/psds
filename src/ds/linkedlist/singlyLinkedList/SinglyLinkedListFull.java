package ds.linkedlist.singlyLinkedList;

/**
 * Created by arun.kumarg on 20/07/16.
 */
public class SinglyLinkedListFull {

  private int key;
  private int length;
  private Node head;

  public int getKey() {
    return key;
  }

  public int getLength() {
    return length;
  }

  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public void insertAtBegin(int key){
    if(head == null){
      head = new Node(key);
      length++;

    }else{
      Node newNode = new Node(key);
      newNode.setNext(head);
      head = newNode;
      length++;
    }
  }

  public void insertAtEnd(int key){
    if(head == null){
      head = new Node(key);
      length++;

    }else{
      Node node = head;
      while (node.getNext() != null){
        node = node.getNext();
      }
      node.setNext(new Node(key));
      length++;
    }

  }

  public void insertAtPosition(int position, int key){

    if(position > length && position !=0){
      throw new ArrayIndexOutOfBoundsException("Index: "+position+", Size: "+length);
    }

    if(length == 0){
      head = new Node(key);
      length++;
    }else{
      Node node = head;
      int count = 0;
      while(count < position-1){
        node = node.getNext();
        count++;
      }
      Node newNode = new Node(key);
      newNode.setNext(node.getNext());
      node.setNext(newNode);
      length++;
    }

  }


  public int removeAtBegin(){

    if(length == 0){
      throw new ArrayIndexOutOfBoundsException("Index: 0, Size: 0");
    }else{
      Node node = head;
      head = head.getNext();
      node.setNext(null);
      length--;
      return node.getKey();
    }
  }

  public int removeAtEnd(){

    if(length == 0){
      throw new ArrayIndexOutOfBoundsException("Index: 0, Size: 0");

    }else if(length == 1){
      Node currentNode = head;
      head = null;
      length--;
      return currentNode.getKey();
    } else{

      Node prevNode = null;
      Node currentNode = head;

      while(currentNode.getNext() != null){
        prevNode = currentNode;
        currentNode = currentNode.getNext();
      }

      prevNode.setNext(null);
      length--;
      return currentNode.getKey();
    }

  }

  public int removeAtPosition(int position, int key){

    return 0;
  }

  public String toString(){
    String string = "[";

    Node node = head;
    while (node != null){
      string = string+node.getKey();
      node = node.getNext();
      if(node != null){
        string = string + ", ";
      }
    }

    string = string + "]";

    return string;
  }

}
