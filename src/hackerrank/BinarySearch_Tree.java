/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;


/**
 *
 * @author meet
 */

//Question : https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem
class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class BinarySearch_Tree {

    Node root;

    public static Node insert(Node root, int data) {

        return root;
    }

    boolean checkBST(Node root) {
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean check(Node n, int min, int max) {
        if (n == null) {
            return true;
        }
        if (n.data <= min || n.data >= max) {
            return false;
        }
        return check(n.left, min, n.data)
                && check(n.right, n.data, max);
    }

    public static void main(String arg[]) {
        int NumOfNode;
        Node root = null;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of node:");
//        NumOfNode = sc.nextInt();
        BinarySearch_Tree tree = new BinarySearch_Tree();
        tree.root = new Node(25);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(22);
        tree.root.right.right = new Node(35);
        tree.root.right.left = new Node(32);

        BinarySearch_Tree bt =new BinarySearch_Tree();
        boolean ans=bt.checkBST(tree.root);
        System.out.println("Result : ----> "+ans);
//        
//        for(int i=0;i<NumOfNode;i++)
//        {
//            int data=sc.nextInt();
//            root=insert(root,data);
//           
//        }
       // System.out.println("---root---->" + root.data);
//         int hight=getHight(root);
//         System.out.println("Max hight of the tree is: "+hight);

    }
}
