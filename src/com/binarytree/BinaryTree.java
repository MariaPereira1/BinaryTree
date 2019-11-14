package com.binarytree;

public class BinaryTree {
    private Node root = null;

    public void add(int value) {
        if (root == null) {
            this.root = new Node(value);
            return;
        } else {
            addNode(root, value);
        }
    }

    public void addNode(Node current, int value) {
        if (value > current.value) {
            if (current.right == null) {
                current.right = new Node(value);
            } else {
                addNode(current.right, value);
            }
        } else {
            if (current.left == null) {
                current.left = new Node(value);
            } else {
                addNode(current.left, value);
            }
        }
    }

    public int Max() {
        return _max(this.root).value;
    }

    public Node _max(Node node){
        if(node == null){
            return node;
        }

        Node max_left = _max(node.left);
        Node max_right = _max(node.right);

        if(node.value > max_left.value && node.value > max_right.value){
            return node;
        }
        if(max_left.value > node.value && max_left.value > max_right.value){
            return max_left;
        }
        return max_right;
    }

    public void print(Node node) {
        if(node == null){
            return;
        }
        System.out.println(node.value + " ");
        print(node.left);
        print(node.right);
    }

    public Node getRoot() {
        return root;
    }
}
