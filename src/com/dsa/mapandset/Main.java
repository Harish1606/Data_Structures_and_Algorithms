package com.dsa.mapandset;

import java.util.HashMap;
import java.util.HashSet;

//HashMap is not synchronized and hashtable is synchronized
//HashMap allow one null key and multiple null values whereas hashtable doesn't allow null key or value.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("harish", 98);
        map.put("dinesh", 85);
        map.put("raja", 92);
        System.out.println(map.get("harish"));
        System.out.println(map.containsKey("raja"));

        HashSet<Integer> set = new HashSet<>();
        set.add(13);
        set.add(63);
        set.add(72);
        set.add(27);
        set.add(13);
        System.out.println(set);

        MapUsingHash mapUsingHash = new MapUsingHash();
        mapUsingHash.put("harish", "Full stack developer");
        mapUsingHash.put("dinesh", "Social worker");
        mapUsingHash.put("raja", "AI enthusiast");
        System.out.println(mapUsingHash.get("harish"));
        mapUsingHash.remove("harish");
        System.out.println(mapUsingHash.get("harish"));
    }


}
