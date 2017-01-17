package datastructure.hashtable;

/**
 * Created by byun.ys on 2017-01-12.
 */
public class Node<Integer, Character> {

    int hash;

    public int getHash() {
        return hash;
    }

    char v;

    public Node(int hash, char v) {
        this.hash = hash;
        this.v = v;
    }

}
