package ds.linkedlist.app1;

import java.util.LinkedList;
/**
 * Created by arun on 12/03/17.
 */
public class Node<E> {
    private E key;
    private Node<E> next;

    public Node(E key) {
        this.key = key;
        this.next = null;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getKey() {
        return key;
    }
}
