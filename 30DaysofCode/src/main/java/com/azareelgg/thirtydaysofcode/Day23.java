package com.azareelgg.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class NodeDay23 {
    NodeDay23 left,right;
    int data;
    NodeDay23(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day23 {

    static void levelOrder(NodeDay23 root){
        Queue<NodeDay23> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while ( ! queue.isEmpty()) {
            NodeDay23 n = queue.remove();
            System.out.print(n.data + " ");
            if (n.left != null) {
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);
            }
        }
    }

    public static NodeDay23 insert(NodeDay23 root, int data){
        if(root==null){
            return new NodeDay23(data);
        }
        else{
            NodeDay23 cur;
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

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        NodeDay23 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
