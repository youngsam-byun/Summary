package datastructure;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class BinarySearch {

    @Test
    public void test(){
        int[] A=new int[]{9,8,7,6,5,4,3,2,1};
        Arrays.sort(A);
        assertThat(test(A,4)).isEqualByComparingTo(3);

    }

    private  int test(int[] A,int k){
        if(A==null)
            return  -1;

        int len=A.length;
        int s=0;
        int e=len-1;

        while(s<=e){
            int m=(s+e)/2;

            if(A[m]<k)
                s=m+1;
            else if (A[m]>k)
                e=m-1;
            else
                return  m;

        }

        return  -1;


    }
}
