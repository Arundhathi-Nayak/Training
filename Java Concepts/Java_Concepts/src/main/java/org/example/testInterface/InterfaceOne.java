package org.example.testInterface;

public interface InterfaceOne
{
    default void show() {
        System.out.println("Default TestInterface One");
    }
}
