package org.example.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RunnableDemo {

    static Logger logger = Logger.getLogger("RunnableDemo");

    public static void main(String[] args) {
        Runnable task =()-> {

                for (int i = 1; i <= 5; i++) {
                    System.out.println("Number: " + i);

                    try {
                        // Sleep for 1 second between prints
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        logger.log(Level.WARNING, "Interrupted!", e);
                        Thread.currentThread().interrupt();
                    }
                }

        };


        Thread thread = new Thread(task);
        thread.start();
    }
}
