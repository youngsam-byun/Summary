package permutation;

import org.junit.Test;

/**
 * Created by YS on 2017-01-14.
 */
public class Combination2 {

    public static final int[] GIVEN = new int[]{1, 2, 3,4};
    private static int N=GIVEN.length;
    private  static int R =3;

    @Test
    public  void solution(){

        int[] tmp =new int[N];

        combination(N, R,0,0,tmp,N);

    }

    public  void combination(int n,int r,int index,int lookupIndex,int[] tmp,int initN){

        if(r==0){
            print(tmp,index);
            return;
        }else if(r<0||initN==lookupIndex)
            return;
        else {

            tmp[index]=GIVEN[lookupIndex];
            combination(n-1,r-1,index+1,lookupIndex+1,tmp,initN);
            combination(n-1,r,index,lookupIndex+1,tmp,initN);


        }

    }

    private void print(int[] A, int r) {
        for(int i=0;i<r;i++)
            System.out.print(A[i]);

        System.out.println();
    }
}
