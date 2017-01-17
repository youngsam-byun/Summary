package datastructure.hashtable;

/**
 * Created by byun.ys on 2017-01-12.
 */
public class HashTable<Integer,Character> {
    private static final int SIZE = 1024;

    private  Node<Integer,Character>[] node;

    public HashTable() {
        node=new Node[SIZE];
    }

    public  void put(int k,char v){
        int hash=k%SIZE;

        while(node[hash]!=null)
            hash=(hash+1)%SIZE;

        if(node[hash]!=null)
            return;

        node[hash]=new Node<>(hash,v);
    }

    public  Node get(int k){
        int hash=k%SIZE;
        int hash2=node[k].getHash();

        while( hash < SIZE && hash!=hash2 )
            hash=(hash+1)%SIZE;

        return node[hash];

    }
}
