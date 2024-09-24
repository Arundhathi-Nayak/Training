package org.example.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> stringSet=new HashSet<>();
        stringSet.add("Akash");
        stringSet.add("Eeksha");
        stringSet.add("Arundhathi");
//        stringSet.add("Akash"); Duplicate element cannot add
        stringSet.forEach(System.out::println);
        stringSet.remove("Eeksha");
        int size =stringSet.size();
        System.out.println("The size of the set is: " + size);
    }
}
