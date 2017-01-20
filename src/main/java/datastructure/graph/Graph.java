package datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by byun.ys on 2017-01-20.
 */


public class Graph {
    private  static boolean[] bs;
    private  static List<List<Integer>> graphs;
    private  static Queue<Integer> q;
    public  static void main(String[] args){

        graphs=new ArrayList<>();

        for(int i=0;i<7;i++)
            graphs.add(new ArrayList<>());

        bs=new boolean[7];

                int[][] givenEdges= {
                {1, 2},
                {1, 4},
                {1, 6},
                {2, 3},
                {3, 4},
                {4, 5},
                {5, 6}
        };

        int len=givenEdges.length;
        for(int i=0;i<len;i++){
            int s=givenEdges[i][0];
            int e=givenEdges[i][1];
            graphs.get(s).add(e);
            graphs.get(e).add(s);

        }
        //dfs(4);

        q=new LinkedList<>();
        bfs(4);

    }

    private static void dfs(int i) {
        if(bs[i]==false) {
            bs[i] = true;
            System.out.print(i + "-->");
        }

        for(int j:graphs.get(i)){
            if(bs[j]==false)
                dfs(j);
        }
    }

    private  static void bfs(int i){
        q.offer(i);

        while(!q.isEmpty()){

            int t=q.poll();
            if(bs[t]==false) {
                bs[t] = true;
                System.out.print(t + "-->");
            }

            for(int j:graphs.get(t)){
                if(bs[j]==false){
                    q.offer(j);
                }
            }

        }

    }
}
