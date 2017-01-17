package permutation;

import org.junit.Test;

/**
 * Created by YS on 2017-01-14.
 */
public class PermutationWIthRepetition {



    @Test
    public void test(){
        int[] given= {1, 2, 3, 4, 5};
        int len=given.length;
        int[] tmp=new int[len];

       permutationWithRepetition(5,3,0,0, given,tmp);

    }

    public  void permutationWithRepetition(int n, int p, int curr, int refer, int[] A,int[] B){

        if(curr==p) {
            print(B,p);
            return;
        }
        else if(curr>p || refer>p)
            return;
        else {

            for(int i=0;i<n;i++){
                B[curr]=A[i];
                permutationWithRepetition(n,p,curr+1,refer+1,A,B);

            }



        }

    }

    private void swap(int curr, int refer, int[] A) {
        int t=A[curr];
        A[curr]=A[refer];
        A[refer]=t;
    }

    private void print(int[] A, int p) {
        for(int i=0;i<p;i++)
            System.out.print(A[i]);

        System.out.println();
    }
}
