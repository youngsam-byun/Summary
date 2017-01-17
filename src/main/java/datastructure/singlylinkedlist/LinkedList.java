package datastructure.singlylinkedlist;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class LinkedList {

    Node head;

    public  LinkedList(){
    }

    public  void insert(int d){
        if(head==null) {
            head = new Node(d);
            return;
        }

        Node curr=head;

        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=new Node(d);

    }

    public void printConsole(){

        if(head==null)
            return;

        Node curr=head;
        while(curr!=null){
            System.out.print(curr.d +" >> ");
            curr=curr.next;
        }
        System.out.println();
    }

    public   void reverse(){

        if(head==null)
            return;

        Node prev=head;
        Node curr=head.next;

        if(curr==null)
            return;

        Node next=curr.next;

        if(next==null){
            curr.next=prev;
            prev.next=null;
            head=curr;
            return;
        }

        prev.next=null;

        while(curr.next!=null){
            next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        curr.next=prev;
        head=curr;
    }

    public  void recursiveReverse(Node n){

        if(n.next==null) {
            head=n;
            return;
        }

        recursiveReverse(n.next);

        n.next.next=n;
        n.next=null;
    }

}
