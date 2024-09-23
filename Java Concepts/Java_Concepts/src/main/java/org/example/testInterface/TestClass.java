package org.example.testInterface;

public class TestClass implements InterfaceOne,InterfaceTwo,PrivateInterface{

    @Override
    public void show() {
        InterfaceOne.super.show();
        InterfaceTwo.super.show();
    }

    public static void main(String[] args) {
        TestClass testClass=new TestClass();
        testClass.show();
        System.out.println( testClass.hello());
    }
}
