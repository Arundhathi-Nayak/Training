package org.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Duplicate elements allowed
public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Shreyas");
        list.add("Eeksha");
        list.add("Arundhathi");
        list.add(1,"Akash");//insert in specific position
        System.out.println("Index 2 element:"+list.get(2));
        Iterator iterator=list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        list.iterator().forEachRemaining(System.out::println);

    }
}
