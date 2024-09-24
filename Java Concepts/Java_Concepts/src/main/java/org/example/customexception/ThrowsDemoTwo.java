package org.example.customexception;

import java.util.Scanner;

public class ThrowsDemoTwo {
    public int number(String input) throws MyException {
        try{
            return Integer.parseInt(input);
        }catch (NumberFormatException exception){
            throw new MyException("Invalid input, input must be a number");
        }
    }

    public static void main(String[] args) {
        ThrowsDemoTwo throwsDemoTwo=new ThrowsDemoTwo();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
         String input=scanner.nextLine();
        try{
            throwsDemoTwo.number(input);
            System.out.println("Enterd value is number:"+input);
        } catch (MyException e) {
           System.out.printf(e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
