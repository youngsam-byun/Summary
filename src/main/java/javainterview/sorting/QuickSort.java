package javainterview.sorting;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class QuickSort {

    @Test
    public void sortTest() {
        int[] A = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int len = A.length;
        sort(A, 0, len - 1);
        assertThat(A).isEqualTo(expected);
    }


    public void sort(int[] A, int s, int e) {
        if (A == null)
            return;

        if (A.length == 1)
            return;

        int s_hold = s;
        int e_hold = e;

        int m = (s + e) / 2;

        while (s <=e ) {

            while (A[s] < A[m])
                s++;

            while (A[m] < A[e])
                e--;

            if (A[s] > A[e]) {
                int t = A[s];
                A[s] = A[e];
                A[e] = t;
            }
            s++;
            e--;
        }

        if (s_hold < e)
            sort(A, s_hold, e);

        if (s < e_hold)
            sort(A, s, e_hold);
    }


}
