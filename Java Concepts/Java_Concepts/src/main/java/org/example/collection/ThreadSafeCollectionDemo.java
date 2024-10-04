package org.example.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeCollectionDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(1, "Arundhathi");
        concurrentHashMap.put(2, "Eeksha");
        concurrentHashMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
