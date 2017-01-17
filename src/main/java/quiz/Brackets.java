package quiz;

/**
 * Created by byun.ys on 2017-01-12.
 */

import org.junit.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
 * <p>
 * S is empty;
 * S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
 * S has the form "VW" where V and W are properly nested strings.
 * For example, the string "{[()()]}" is properly nested but "([)()]" is not.
 * <p>
 * Write a function:
 * <p>
 * int solution(char *S);
 * that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
 * <p>
 * For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [0..200,000];
 * string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */

public class Brackets {

    @Test
    public void test() {
        String S = "{[()()]}";
        assertThat(solution(S)).isEqualByComparingTo(1);
    }

    public int solution(String S) {
        if (S == null || S.length() % 2 == 1)
            return 0;

        if (S.isEmpty())
            return 1;

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        Stack<Character> s3 = new Stack<>();

        int N = S.length();

        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);

            if (c == '[')
                s1.push(c);
            else if (c == '{')
                s2.push(c);
            else if (c == '(')
                s3.push(c);
            else if (c == ']' || c == '}' || c == ')')
                continue;
            else
                return 0;

        }

        char lastOpen = '\u0000';

        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            char c2 = '\u0000';

            if (c == ']' || c == '}' || c == ')') {
                if (c == ']')
                    c2 = s1.pop();
                else if (c == '}')
                    c2 = s2.pop();
                else //if (c == ')')
                    c2 = s3.pop();

                if (lastOpen == c2)
                    ;
                else
                    return 0;
            }else
                lastOpen = c;


        }
        return 1;

    }
}
