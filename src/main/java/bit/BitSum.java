package bit;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class BitSum {

    public static final int EXPECTED = 1;

    @Test
    public void test() {

        assertThat(sum(1, 3)).isEqualByComparingTo(4);

    }

    public int sum(int a, int b) {
        int r=a;

        while (b != 0) {
            r=a^b;
            b=a&b;
            a=r;

            b<<=1;
        }

        return r;

    }
}
