package com.dsa.recursion.tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.populate(new Scanner(System.in));
        binaryTree.display();
        binaryTree.prettyDisplay();
    }
}
