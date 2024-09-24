package org.example.customexception;

public class DemoException {
    public static void main(String args[]){
        try{
            int a = 9;
            int b = 0;
            int c = 10;
            //int e = a / b;
            int f = a / c;
            System.out.println("Result is:" + f);
            if(f == 0){
                throw new MyException("Custom Exception occurred");
            }
        }
        catch(ArithmeticException e){
            System.out.println("ERROR IN DIVIDING");
        }
        catch(MyException e1){
            System.out.println(e1.getMessage());
        }
        finally{
            System.out.println("I WILL RUN ALWAYS");
        }
    }
}
