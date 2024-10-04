package org.example.solidprinciples;

/**
 * {@link BankService} Starting point of execution
 */
public class BankMain {

    public static void main(String[] args) {

        ConsoleInterface consoleInterface=new ConsoleService();
        boolean condition=true;
        while(condition){
          condition=consoleInterface.menu();
        }

    }

}

