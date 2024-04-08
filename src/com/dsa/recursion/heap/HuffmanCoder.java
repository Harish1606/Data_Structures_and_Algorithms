package com.dsa.recursion.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanCoder {
    HashMap<Character,String> encoder;
    HashMap<String,Character> decoder;

    private class Node implements Comparable<Node>{
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data, int cost){
            this.data = data;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception{
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < feeder.length(); i++) {
            freqMap.put(feeder.charAt(i),freqMap.getOrDefault(feeder.charAt(i),0)+1);
        }

        Heap<Node> minHeap = new Heap<>();
        Set<Map.Entry<Character, Integer>> entrySet = freqMap.entrySet();

        for(Map.Entry<Character, Integer> entry : entrySet){
            Node node = new Node(entry.getKey(),entry.getValue());
            minHeap.insert(node);
        }

        while (minHeap.size() != 1){
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.insert(newNode);
        }

        Node fullTree = minHeap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initEncoderDecoder(fullTree,"");
    }

    private void initEncoderDecoder(Node node, String output){
        if (node ==  null){
            return;
        }

        if(node.left == null && node.right == null){
            this.encoder.put(node.data, output);
            this.decoder.put(output, node.data);
        }

        initEncoderDecoder(node.left,output+"0");
        initEncoderDecoder(node.right, output+"1");
    }

    public String encode(String source){
        String ans = "";
        for (int i = 0; i < source.length(); i++) {
            ans = ans + encoder.get(source.charAt(i));
        }
        return ans;
    }

    public String decode(String encodedString){
        String key = "";
        String ans = "";
        for (int i = 0; i < encodedString.length(); i++) {
            key = key + encodedString.charAt(i);
            if(decoder.containsKey(key)){
                ans = ans + decoder.get(key);
                key = "";
            }
        }
        return ans;
    }
}
