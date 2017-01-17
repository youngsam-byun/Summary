package quiz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**

Minimum number of bracket reversals needed to make an expression balanced
        Given an expression with only ‘}’ and ‘{‘. The expression may not be balanced. Find minimum number of bracket reversals to make the expression balanced.

        Examples:

        Input:  exp = "}{"
        Output: 2
        We need to change '}' to '{' and '{' to
        '}' so that the expression becomes balanced,
        the balanced expression is '{}'

        Input:  exp = "{{{"
        Output: Can't be made balanced using reversals

        Input:  exp = "{{{{"
        Output: 2

        Input:  exp = "{{{{}}"
        Output: 1

        Input:  exp = "}{{}}{{{"
        Output: 3
*/


/**
 * Created by byun.ys on 2017-01-12.
 */
public class BalancingParenthesis {

    @Test
    public void test() {
        String S = "}{{}}{{{";
        assertThat(solution(S)).isEqualByComparingTo(3);
    }

    public int solution(String S) {

        //null check, number of character should be even
        if (S == null || S.length() % 2 == 1)
            return -1;

        //empy case return 0
        if (S.isEmpty())
            return 0;

        int N = S.length();

        int open = 0;
        int flip = 0;
        char f = S.charAt(0);
        if (f == '{')
            open = 1;
        else {
            flip = 1;
            open=1;
        }

        for (int i = 1; i < N; i++) {
            char c = S.charAt(i);

            if (c == '{') {

                if (open >= 0)
                    open++;
                else { //open<0
                  return -1;
                }


            } else { //c=='}'
                if (open > 0)
                    open--;
                else if (open <= 0) {
                    flip++;
                    open++;
                }

            }

        }

        if (open % 2 != 0)
            return -1;

        int flip2 = open / 2;
        return flip + flip2;

    }

}
