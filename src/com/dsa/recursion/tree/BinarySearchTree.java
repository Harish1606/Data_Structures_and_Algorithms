package com.dsa.recursion.tree;

public class BinarySearchTree {

    public class Node{
        private int value;
        private Node left;
        private Node right;
        int  height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    public Node root;

    public BinarySearchTree(){

    }

    public int height(){
        return height(root);
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
       populateSorted(nums, 0, nums.length-1);
    }

    private void populateSorted(int[] nums, int start, int end){
        if(start > end){
            return;
        }
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid-1);
        populateSorted(nums, mid+1, end);

    }

    public void insert(int value){
        this.root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }

        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root, "Root node : ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public void preOrder(){
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
}
