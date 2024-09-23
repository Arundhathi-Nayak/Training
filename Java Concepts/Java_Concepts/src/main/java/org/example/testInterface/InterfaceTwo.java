package org.example.testInterface;

public interface InterfaceTwo {
    default void show() {
        System.out.println("Default TestInterface Two");
    }
}
