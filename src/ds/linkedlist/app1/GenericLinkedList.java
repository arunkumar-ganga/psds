package ds.linkedlist.app1;

/**
 * Created by arun on 12/03/17.
 */
public class GenericLinkedList<E> {
    Node<E> head;

    public void insert(E key){
        insert(head, key);
    }

    private void insert(Node<E> node, E key){

        if(node == null){
            head = new Node<E>(key);
        }else if(node.getNext() == null){
            node.setNext(new Node<E>(key));
        }else{
            insert(node.getNext(),key);
        }
    }

    public boolean delete(E key){
        for(Node<E> node = head, prev=null; node !=null; prev=node, node=node.getNext()){
            if(node.getKey() == key){
                if(prev == null){
                    head = node.getNext();
                }else {
                    prev.setNext(node.getNext());
                }
                node = null;
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String string = "[";

        Node node = head;
        while (node != null){
            string = string+node.getKey().toString() + " ";
            node = node.getNext();
        }

        string = string + "]";

        return string;
    }
}
