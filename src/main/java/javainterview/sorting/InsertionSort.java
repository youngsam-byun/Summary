package javainterview.sorting;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class InsertionSort {

    @Test
    public void sortTest() {
        int[] A = new int[]{9, 8,  6, 5, 3, 3, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected2 = new int[]{1, 2, 3, 3, 5, 6, 8, 9};
        assertThat(sort(A)).isEqualTo(expected2);
    }


    public int[] sort(int[] A) {
        if (A == null)
            return null;
        if (A.length == 1)
            return A;

        int N = A.length;
        for (int i = 0; i < N; i++) {
            int holder = A[i];

            int pos = i;

            while (pos>=1 && A[pos-1]>holder){
                A[pos]=A[pos-1];
                pos--;
            }

            A[pos]=holder;
        }

        return A;
    }


}
