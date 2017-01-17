package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class PassByValueTest {

    public static final int EXPECTED = 4;

    @Test
    public  void test(){
        int a=3;
        hello(a);
        assertThat(a).isEqualByComparingTo(EXPECTED);

    }

    @Test
    public  void test2(){
        TestClass tc = new TestClass();
        tc.a=3;
        hello(tc.a);
        assertThat(tc.a).isEqualByComparingTo(EXPECTED);

    }

    @Test
    public  void test3(){
        TestClass tc = new TestClass();
        tc.al.add(1);
        tc.al.add(2);
        tc.al.add(3);
        hello2(tc);
        assertThat(tc.al.size()).isEqualByComparingTo(EXPECTED);

    }

    @Test
    public  void test4(){
        TestClass tc = new TestClass();
        tc.a=3;
        hello3(tc);
        assertThat(tc.a).isEqualByComparingTo(EXPECTED);

    }

    private void hello(int a) {
        a++;
    }

    private void hello2(TestClass tc) {
        tc.al.add(4);
    }

    private void hello3(TestClass tc) {
        tc.a=4;
    }
    public  static class TestClass{
        Integer a=0;
        List<Integer> al;

        public TestClass() {
            al=new ArrayList<Integer>();
        }
    }



}
