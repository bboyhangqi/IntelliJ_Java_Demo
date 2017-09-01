package com.company.interview;

import java.util.Stack;

/**
 * Created by zhaomingming-s on 2017/8/30.
 */
public class MyBinaryTree {

    Node root ;

    class Node {
        Node leftChild ;
        Node rightChild ;
        String data ;
        int level;
    }

    public void preOrder(Node node){
        if(node!=null){
            showNode(node);
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }

    }

    public void nonRecPreOrder(Node node){
        Stack<Node> stack =new Stack<Node>();
        if(node!=null){
            while(node!=null&&!stack.isEmpty()){
                while(node!=null){
                    showNode(node);
                    stack.push(node);
                    node=node.leftChild;
                }

                if(!stack.isEmpty()){
                    node=stack.pop();
                    node=node.rightChild;
                }
            }
        }
    }

    public void showNode(Node node){
        System.out.println(node.data);
    }




}
