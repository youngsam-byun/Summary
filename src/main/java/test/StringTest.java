package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YS on 2017-01-15.
 */
public class StringTest {
    private static final char DELIMITER=',';

    @Test
    public  void test(){
    String[] str={"a","a","a","a","a","a"};
    String result=merge(str);
    System.out.println(result);
        String[] result2=deMerge(result);

        for(int i=0;i<result2.length;i++)
            System.out.println(result2[i]);
    }

    public String merge(String[] str){

        if(str==null)
            return null;

        int N=str.length;
        if(N==1)
            return str[0];

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++)
            sb.append(str[i].length())
                    .append(DELIMITER)
                    .append(str[i]);


        return sb.toString();

    }


    public String[] deMerge(String str){

        if(str==null)
            return null;

        if(str.isEmpty())
            return new String[0];

        int N=str.length();

        List<String> result=new ArrayList<>();
        int i=0;
        while(i<N){
            int j=i;

            while(str.charAt(j)!=DELIMITER){
                j++;
            }

            int len=Integer.parseInt(str.substring(i,j));
            i=j+1+len;

            result.add(str.substring(j+1,i));

        }

        return result.toArray(new String[result.size()]);
    }

}
