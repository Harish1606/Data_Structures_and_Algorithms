package com.dsa.recursion.tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.populate(new Scanner(System.in));
//        binaryTree.display();
//        binaryTree.prettyDisplay();

        int[] nums = {5, 1, 8, 2, 11, 16, 3, 7};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.populate(nums);
        binarySearchTree.display();
        binarySearchTree.preOrder();
        binarySearchTree.inOrder();
        binarySearchTree.postOrder();

        System.out.println("Binary search tree for sorted array");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinarySearchTree binarySearchTree1 = new BinarySearchTree();
        binarySearchTree1.populateSorted(arr);
        binarySearchTree1.display();


    }
}
