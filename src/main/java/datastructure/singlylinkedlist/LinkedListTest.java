package datastructure.singlylinkedlist;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class LinkedListTest {

    private LinkedList li;

    @Before
    public  void init(){
        li = new LinkedList();
    }
    @Test
    public   void test(){
        li.insert(1);
        li.insert(2);
        li.insert(3);
        li.insert(4);
        li.insert(5);

        li.printConsole();

        li.reverse();

        li.printConsole();

        li.recursiveReverse(li.head);
        li.printConsole();
    }
}
