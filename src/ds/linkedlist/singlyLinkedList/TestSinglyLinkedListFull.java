package ds.linkedlist.singlyLinkedList;

/**
 * Created by arun.kumarg on 20/07/16.
 */
public class TestSinglyLinkedListFull {

  public static void test(){
    SinglyLinkedListFull slf = new SinglyLinkedListFull();
    slf.insertAtPosition(0, 10);
    System.out.println("Removed: "+ slf.removeAtEnd());
    System.out.println(slf + "-->" + slf.getLength());
    slf.insertAtBegin(12);
    slf.insertAtEnd(15);
    slf.insertAtPosition(2, 13);
    System.out.println(slf + "-->" + slf.getLength());

    slf.insertAtPosition(0, 55);

    slf.insertAtBegin(19);
    slf.insertAtEnd(1);
    slf.insertAtPosition(2, 132);
    System.out.println(slf + "-->" + slf.getLength());

    System.out.println("Removed: "+ slf.removeAtBegin());
    System.out.println(slf + "-->" + slf.getLength());

    System.out.println("Removed: "+ slf.removeAtEnd());
    System.out.println(slf + "-->" + slf.getLength());

  }

  public static void main(String[] args) {
    test();
  }

}
