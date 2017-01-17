package datastructure.BinaryTree;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class BinaryTreeTest {

    private BinaryTree bt;

    @Before
    public void init() {
        bt = new BinaryTree();
    }

    @Test
    public void test() {
        bt.insert(55);
        bt.insert(45);
        bt.insert(65);
        bt.insert(35);
        bt.insert(50);
        bt.insert(60);
        bt.insert(70);
        bt.insert(30);
        bt.insert(37);
        bt.insert(47);
        bt.insert(52);

        bt.print();

        bt.delete(65);
        bt.print();


    }
}
