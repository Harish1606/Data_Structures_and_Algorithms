package com.dsa.recursion.heap;

//Time complexity for insertion - O(log(N)), deletion - O(log(N)), heap sort - O(N*log(N))
//Space complexity - O(N)
public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);

        System.out.println(heap.remove());

        System.out.println(heap.heapSort());
    }
}
