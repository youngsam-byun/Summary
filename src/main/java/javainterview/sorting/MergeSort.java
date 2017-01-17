package javainterview.sorting;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class MergeSort {

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

        if (s == e)
            return;
        int m = (s + e) / 2;

        sort(A, s, m);
        sort(A, m + 1, e);

        merge(A, s, m, m + 1, e);
    }

    private void merge(int[] A, int s, int m1, int m2, int e) {
        int len = (e - s + 1);

        int[] tmp = new int[len];

        int pos1 = s;
        int pos2 = m2;
        int pos = 0;

        while (pos1 <= m1 && pos2 <= e) {
            if (A[pos1] < A[pos2])
                tmp[pos++] = A[pos1++];
            else
                tmp[pos++] = A[pos2++];
        }

        while (pos1 <= m1)
            tmp[pos++] = A[pos1++];

        while (pos2 <= e)
            tmp[pos++] = A[pos2++];


        for (int i = 0; i < len; i++) {
            A[s + i] = tmp[i];
        }

    }


}
