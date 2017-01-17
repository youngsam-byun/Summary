package javainterview.sorting;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class BubbleSort {

    @Test
    public  void sortTest(){
        int[] A=new int[]{9,8,7,6,5,4,3,2,1};
        int[] expected=new int[]{1,2,3,4,5,6,7,8,9};
        assertThat(sort(A)).isEqualTo(expected);
    }


    public int[] sort(int[] A){
        if(A==null)
            return  null;
        if(A.length==1)
            return A;

        int N=A.length;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int a=A[i];
                int b=A[j];

                if(a>b){
                    int t=A[i];
                    A[i]=A[j];
                    A[j]=t;
                }

            }
        }


        return A;
    }


}
