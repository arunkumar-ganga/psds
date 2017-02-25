package ds.linkedlist.singlyLinkedList;

/**
 * Created by arun.kumarg on 20/07/16.
 */
public class TestSinglyLinkedList {

  public static void main(String[] args) {
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.insert(10);
    sll.insert(20);
    sll.insert(130);
    sll.insert(230);
    sll.insert(201);

    System.out.println(sll);
    System.out.println(sll.remove());
    System.out.println(sll);
  }

}
