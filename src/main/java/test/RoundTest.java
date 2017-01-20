package test;

import org.junit.Test;

/**
 * Created by byun.ys on 2017-01-19.
 */
public class RoundTest {

    @Test
    public void test(){

        Double d= 12.34675d;

        System.out.println(String.format("%.2f",d));
        System.out.println((double)Math.round(d*100)/100);

    }
}
