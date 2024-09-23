package org.example.testInterface;

public interface PrivateInterface {

    default  String hello() {
        return getString();
    }
    private static String getString(){
        return "hello";
    }
}
