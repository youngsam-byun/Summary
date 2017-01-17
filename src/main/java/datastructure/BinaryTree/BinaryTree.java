package datastructure.BinaryTree;

import java.util.Stack;

/**
 * Created by byun.ys on 2017-01-11.
 */
public class BinaryTree {

    Node root;

    public BinaryTree() {
    }

    public void insert(int k) {
        if (root == null) {
            root = new Node(k);
            return;
        }


        Node cur = root;
        Node par = null;

        while (cur != null) {
            par = cur;
            if (cur.d > k)
                cur = cur.left;
            else if (cur.d < k)
                cur = cur.right;
            else
                return;
        }

        if (par.d > k)
            par.left = new Node(k);
        else
            par.right = new Node(k);
    }

    public void print() {

        if (root == null)
            return;

        Node n = root;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(n);
        boolean isEmpty = false;

        while (isEmpty == false) {
            isEmpty = true;
            while (s1.isEmpty() == false) {

                n = s1.pop();

                if (n != null) {

                    System.out.print("  " + n.d + "  ");
                    s2.push(n.left);
                    s2.push(n.right);


                    if (n.left != null || n.right != null) {
                        isEmpty = false;
                    }

                } else {

                    System.out.print("  X  ");
                    s2.push(null);
                    s2.push(null);
                }
            }

            System.out.println();

            while (s2.isEmpty() == false)
                s1.push(s2.pop());

        }

    }

    public void printTree() {

        if (root == null)
            return;

        boolean isEmpty = false;

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        Node curr = root;

        s1.add(curr);

        while (isEmpty == false) {
            isEmpty = true;

            while (s1.empty() == false) {
                Node n = s1.pop();

                if (n != null) {
                    System.out.print("  " + n.d + "  ");

                    if (n.left != null || n.right != null) {
                        isEmpty = false;

                        s2.add(n.left);
                        s2.add(n.right);
                    } else {
                        s2.add(null);
                        s2.add(null);

                    }

                } else {
                    System.out.print("  XX  ");
                    s2.add(null);
                    s2.add(null);
                }

            }

            System.out.println();

            while (s2.isEmpty() == false)
                s1.add(s2.pop());

        }
    }

    public void delete(int k) {

        if (root == null)
            return;

        Node parr = null;
        Node curr = root;

        //find
        while (curr != null) {

            if (curr.d > k) {
                parr = curr;
                curr = curr.left;
            } else if (curr.d < k) {
                parr = curr;
                curr = curr.right;
            } else
                break;

        }

        //not found
        if (curr == null)
            return;

        Node candidate = null;

        if (curr.left == null && curr.right == null) {
                if (parr.left == curr) {
                    parr.left = null;
                } else {// if(parr.right==curr){
                    parr.right = null;
                }
        } else if (curr.left != null && curr.right == null) {
            if(parr!=null) {
                if (parr.left == curr) {
                    parr.left = curr.left;
                } else {// if(parr.right==curr){
                    parr.right = curr.left;
                }
            }else{
                root=curr.left;
            }

        } else if (curr.left == null && curr.right != null) {
            if(parr!=null) {
                if (parr.left == curr) {
                    parr.left = curr.right;
                } else {// if(parr.right==curr){
                    parr.right = curr.right;
                }
            }else{
                root=parr.right;
            }
        } else {
            candidate = findCandidate(curr);

            candidate.left = curr.left;
            candidate.right = curr.right;

            if(parr!=null) {
                if (parr.left == curr) {
                    parr.left = candidate;
                } else {// if(parr.right==curr){
                    parr.right = candidate;
                }
            }else{
                root=candidate;
            }
        }

    }

    private Node findCandidate(Node deleteNode) {
        Node rightChild = deleteNode.right;

        Node parr=rightChild.left;

        if(parr==null) {
            deleteNode.right=rightChild.right;
            return rightChild;
        }

         Node curr=parr.left;
        if(curr==null){
            deleteNode.right=parr.right;
            return parr;
        }

         while(curr.left!=null){
             parr=curr;
             curr=curr.left;
         }


         parr.left=curr.right;

         return  curr;
    }

}

