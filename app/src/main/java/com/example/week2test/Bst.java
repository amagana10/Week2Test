package com.example.week2test;

public class Bst {
    Node root;

    public Bst() {
        root = null;
    }

    class Node {
        int key;
        Node left;
        Node right;

        public Node(int num) {
            key = num;
            left = right = null;
        }
    }

    void add(int key){
        root = add(root,key);
    }

    Node add(Node root,int key){
        if (root == null){
            root = new Node(key);
            return root;
        }
        if (key < root.key){
            root.left = add(root.left, key);
        } else if (key> root.key){
            root.right = add(root.right,key);
        }
        return root;
    }

    public void preorder(){
        preorder(root);
    }
    void preorder(Node root){
        if (root!=null)
        {
            System.out.println(root.key);
            preorder(root.left);
            preorder(root.right);
        }
    }
}
