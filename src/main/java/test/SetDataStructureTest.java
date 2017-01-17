package test;

import org.junit.Test;

import java.util.*;

/**
 * Created by YS on 2017-01-14.
 */
public class SetDataStructureTest {


    @Test
    public  void test(){

        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(8);
        ts.add(19);
        ts.add(-2);
        ts.add(3);
        ts.add(3);


        System.out.println("Here is the HashSet: " + ts);

        Map<String,Set<String>> hmap = new HashMap<>();

        hmap.get("hello");


    }

}
