package com.azareelgg.thirtydaysofcode;

import java.util.Scanner;

class NodeDay24{
    int data;
    NodeDay24 next;
    NodeDay24(int d){
        data=d;
        next=null;
    }
}

public class Day24 {

    public static NodeDay24 removeDuplicates(NodeDay24 head) {
        //Write your code here
        if (head == null || head.next == null)
            return head;
        if (head.data == head.next.data){
            head.next = head.next.next;
            removeDuplicates(head);
        }else{
            removeDuplicates(head.next);
        }
        return head;
    }

    public static NodeDay24 insert(NodeDay24 head, int data){
        NodeDay24 p=new NodeDay24(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else{
            NodeDay24 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }

    public static void display(NodeDay24 head){
        NodeDay24 start=head;
        while(start!=null){
            System.out.print(start.data+" ");
            start=start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        NodeDay24 head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head = removeDuplicates(head);
        display(head);
    }
}
