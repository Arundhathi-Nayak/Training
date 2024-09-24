package org.example.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list=new LinkedList<String>();
        list.add("Shreyas");
        list.add("Eeksha");
        list.add("Arundhathi");
        list.add("Arundhathi"); // Duplicate elements are allowed
        Iterator iterator=list.iterator();
       list.forEach(System.out::println);
    }
}
