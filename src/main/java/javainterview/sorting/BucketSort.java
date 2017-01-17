package javainterview.sorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class BucketSort {

    @Test
    public void sortTest() {
        Integer[] A = new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(sort(A)).isEqualTo(expected);
    }

    public Integer[] sort(Integer[] A) {
        if (A == null)
            return null;

        if (A.length == 1)
            return A;

        int N = A.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (max < A[i])
                max = A[i];
        }

        int[] tmp = new int[max + 1];
        for (int i = 0; i < N; i++) {
            int a = A[i];
            tmp[a] += 1;
        }

        int len2 = tmp.length;
        List<Integer> tmp2 = new ArrayList<>();
        for (int i = 0; i < len2; i++) {
            int a = tmp[i];
            for (int j = 0; j < a; j++)
                tmp2.add(i);
        }

        return tmp2.toArray(new Integer[tmp2.size()]);

    }


}
