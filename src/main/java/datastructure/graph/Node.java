package datastructure.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by byun.ys on 2017-01-20.
 */
public class Node {
    int v;
    boolean visit;
    List<Node> nodes;
    public  Node(int v){
        this.v=v;
        visit=false;
        nodes=new ArrayList<>();
    }

    public Node() {
        visit=false;
        nodes=new ArrayList<>();
    }
}
