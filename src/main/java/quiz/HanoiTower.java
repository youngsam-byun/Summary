package quiz;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by byun.ys on 2017-01-13.
 */
public class HanoiTower {

    private static Integer count;

    @Test
    public void test() {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);

        Tower t1 = new Tower("Tower 1");
        t1.setS(s1);
        Tower t2 = new Tower("Tower 2");
        Tower t3 = new Tower("Tower 3");

        count = 0;
        solution(t1.s.size(), t1, t3, t2, count);

    }

    public void solution(int n, Tower src, Tower dst, Tower spare, int count) {

        if (n == 0)
            return;
        else {
            int p = src.s.pop();
            dst.s.push(p);
            count++;
            System.out.println(src.name + " --> " + dst.name + " : " + count);

            solution(n - 1, src, spare, dst, count);
            solution(n - 1, spare, dst, src, count);
        }
    }

    public static class Tower {

        public boolean isEmpty() {
            return s.isEmpty();
        }

        String name;
        Stack<Integer> s;

        public Tower(String name) {
            this.name = name;
            s = new Stack<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Stack<Integer> getS() {
            return s;
        }

        public void setS(Stack<Integer> s) {
            this.s = s;
        }
    }

}
