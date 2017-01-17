package binarysearch;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by YS on 2017-01-07.
 */
public class BinarySearch {

    public static final int EXPECTED = 3;

    @Test
    public  void test(){
        int[] A=new int[]{1,2,3,4,5,5,6,7,8,9,10};
        int k=3;

        assertThat(binarySearch(A,k)).isEqualTo(EXPECTED);


    }


    public  int binarySearch(int[] A, int k){

        if(A==null)
            return -1;

        int len=A.length;
        int s=0;
        int e=len-1;

        while(s<=e){

            int m=(s+e)/2;
            int v=A[m];

            if(v==k)
                return v;
            else if(v<k)
                s=m+1;
            else //if(v>k){
                e=m-1;
        }
        return -1;

    }

}
