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

        System.out.println("Huffman coding implementation starts ----------->");

        String str = "abbccda";
        HuffmanCoder huffmanCoder = new HuffmanCoder(str);
        String encodedString = huffmanCoder.encode(str);
        System.out.println(encodedString);
        String decodedString = huffmanCoder.decode(encodedString);
        System.out.println(decodedString);
    }
}
