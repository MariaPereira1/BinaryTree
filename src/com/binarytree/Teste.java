package com.binarytree;

public class Teste {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(10);
        bt.add(20);
        bt.add(500);
        bt.add(30);
        bt.add(40);
        bt.add(50);
        bt.add(100);
        bt.add(60);
        bt.add(70);
        bt.add(80);
        bt.add(90);
        bt.add(101);

        System.out.println(bt.Max());
        bt.print(bt.getRoot());
    }
}
