package academy.learnprogramming;

import java.util.LinkedList;
import java.util.Scanner;


    class Node3{
        Node3 left,right;
        int data;
        Node3(int data){
            this.data=data;
            left=right=null;
        }
    }
public class Day23 {
    static LinkedList<Integer> queue = new LinkedList();
        static void levelOrder(Node3 root){
            //Write your code here
            LinkedList<Node3> treeQueue = new LinkedList();
            treeQueue.add(root);
            while(treeQueue.peek() != null) {
                Node3 toprint = treeQueue.remove();
                System.out.print(toprint.data);
                if(toprint.left != null) {
                    treeQueue.add(toprint.left);
                }
                if(toprint.right != null) {
                    treeQueue.add(toprint.right);
                }
                if(treeQueue.peek() != null) {
                    System.out.print(" ");
                }
            }
        }

        public static Node3 insert(Node3 root,int data){
            if(root==null){
                return new Node3(data);
            }
            else{
                Node3 cur;
                if(data<=root.data){
                    cur=insert(root.left,data);
                    root.left=cur;
                }
                else{
                    cur=insert(root.right,data);
                    root.right=cur;
                }
                return root;
            }
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node3 root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }

}
