package first;

/**
 * Created by YS on 2017-01-08.
 *
 *     1. Self introduction
 *       - project management
 *       - operation
 *         global product support
 *         MDM, mobile device management solution
 *
 *
 */

import java.util.Arrays;

/**
You are given an array with integers between 1 and 1,000,000.
One integer is in the array twice.
 How can you determine which one? and the Order of your algorithm?
 */

public class QuestionandAnswer1 {


    public  int solution(int[] A){
        //precondition check for the argument
        if(A==null || A.length==0 || A.length==1)
            return -1;

        //sort
        Arrays.sort(A);

        int len=A.length;
        //traverse
        int prev=-A[0];

        for(int i=1;i<len;i++){
            int curr=A[i];
            if(curr==prev)
                return i;

            prev=curr;
        }

        return  -1;

    }



}
