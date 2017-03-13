package ds.linkedlist.app1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by arun on 12/03/17.
 */

public class GenericLinkedListTest {

    static  GenericLinkedList<Integer> gl;

    @Before
    public void init(){
        gl = new GenericLinkedList<Integer>();
    }

    @Test
    public void insert() throws Exception {
        gl.insert(1);
        gl.insert(2);
        gl.insert(3);
        gl.insert(4);
        Assert.assertEquals("[1 2 3 4 ]",gl.toString());
    }

    @Test
    public void delete() throws Exception {
        gl.insert(1);
        gl.insert(2);
        gl.insert(3);
        gl.insert(4);
        gl.delete(1);
        Assert.assertEquals("[2 3 4 ]",gl.toString());

        gl.delete(3);
        Assert.assertEquals("[2 4 ]",gl.toString());

        gl.delete(4);
        Assert.assertEquals("[2 ]",gl.toString());

        gl.delete(2);
        Assert.assertEquals("[]",gl.toString());
    }

    @Test
    public void insertFloat() throws Exception {
        GenericLinkedList<Float> gl = new GenericLinkedList<>();
        gl.insert(1.0f);
        gl.insert(2.0f);
        gl.insert(3.0f);
        gl.insert(4.0f);
        Assert.assertEquals("[1.0 2.0 3.0 4.0 ]",gl.toString());
    }

}