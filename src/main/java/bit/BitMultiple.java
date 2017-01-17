package bit;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class BitMultiple {

    public static final int EXPECTED = 1;

    @Test
    public void test() {

        assertThat(multiple(2, 3)).isEqualByComparingTo(6);

    }

    public int multiple(int a, int b) {
        if(a==0 || b==0)
            return  0;

        int r=0;
        while(b!=0){

            if((b&01)==1)
                r+=a;

            a<<=1;
            b>>=1;
        }

        return  r;

    }
}
