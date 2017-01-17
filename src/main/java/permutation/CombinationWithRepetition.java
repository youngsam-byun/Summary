package permutation;

import org.junit.Test;

/**
 * Created by YS on 2017-01-14.
 */
public class CombinationWithRepetition {

    public static final int[] GIVEN = new int[]{1, 2, 3};
    private static int N=GIVEN.length;
    private  static int R =2;

    @Test
    public  void solution(){

        int[] tmp =new int[N];

        combinationWithRepitition(N, R,0,0,tmp);
    }

    public  void combinationWithRepitition(int n, int r, int curr, int refer, int[] tmp){

        if(curr==r){
            print(tmp,r);
            return;
        }else if(curr>r || refer>r)
            return;
        else {

            tmp[curr]=GIVEN[refer];
            combinationWithRepitition(n,r,curr+1,refer,tmp);
            combinationWithRepitition(n,r,curr,refer+1,tmp);


        }

    }

    private void print(int[] A, int r) {
        for(int i=0;i<r;i++)
            System.out.print(A[i]);

        System.out.println();
    }
}
