package org.example.collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Shreyas");
        stack.push("Akash");
        stack.push("Shreyas");
        stack.forEach(System.out::println);
        System.out.println("Top element: "+stack.pop());
    }
}
