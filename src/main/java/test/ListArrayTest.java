package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by byun.ys on 2017-01-20.
 */
public class ListArrayTest {

    @Test
    public  void test(){
        List<List<Integer>> al=new ArrayList<>();
            al.add(new ArrayList<>());

        al.add(8,new ArrayList());
        List<Integer> al2=al.get(8);

    }
}
