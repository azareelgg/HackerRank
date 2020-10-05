package com.azareelgg.thirtydaysofcode;

import java.util.Scanner;

class NodeDay22 {
    NodeDay22 left,right;
    int data;
    NodeDay22(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day22 {

    public static int getHeight(NodeDay22 root){
        if(root == null) {
            return -1;
        }
        int leftDepth = getHeight(root.left);
        int rightDepth = getHeight(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static NodeDay22 insert(NodeDay22 root, int data){
        if(root==null){
            return new NodeDay22(data);
        }
        else{
            NodeDay22 cur;
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
        NodeDay22 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
