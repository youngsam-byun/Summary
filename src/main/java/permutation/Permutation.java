package permutation;

import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

/**
 * Created by YS on 2017-01-14.
 */
public class Permutation {



    @Test
    public void test(){
        int[] given= {1, 2, 3, 4, 5};
       permutation(5,3,0,0, given);

    }

    public  void permutation(int n,int p,int curr,int refer,int[] A){

        if(curr==p) {
            print(A,p);
            return;
        }
        else if(curr>p || refer>p)
            return;
        else {


            for(int i=refer;i<n;i++) {
                //swap
                swap(curr, i, A);

                permutation(n, p, curr + 1, refer + 1, A);

                swap(curr, i, A);


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
