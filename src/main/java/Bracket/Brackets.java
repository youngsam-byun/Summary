package Bracket;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by YS on 2017-01-12.
 */
public class Brackets {

    @Test
    public void test() {

        assertThat(solution("([)()]")).isEqualByComparingTo(0);
    }

    public int solution(String S) {

        if (S == null || S.length() == 1)
            return 0;

        if (S.isEmpty())
            return 1;

        int N = S.length();

        Stack<Character> stack = new Stack<Character>();


        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (c == '[' ||
                    c == '{' ||
                    c == '(')
                stack.push(c);
            else {

                if (stack.isEmpty())
                    return 0;

                char d = stack.pop();
                if (
                        (d == '[' && c == ']') ||
                                (d == '{' && c == '}') ||
                                (d == '(' && c == ')')
                        )
                    ;
                else
                    return 0;
            }
        }

        if (stack.isEmpty() == false)
            return 0;

        return 1;

    }
}
