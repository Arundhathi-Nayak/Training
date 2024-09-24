package org.example.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Akash",10);
        map.put("Eeksha",11);
        map.put("Shreyas",12);
        map.put("Arundhathi",13);
        System.out.println("Eeksha's age is: " +map.get("Eeksha") );
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
      map.forEach((key,value)-> System.out.println("key,Value = " + key+" "+value));

    }
}
