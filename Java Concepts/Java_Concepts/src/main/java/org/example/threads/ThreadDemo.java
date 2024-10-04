package org.example.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadDemo extends Thread{
    // Define a class that extends the Thread class
    static Logger logger = Logger.getLogger("ThreadDemo");


    @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
               logger.info("Number: " + i);
                    try {
                        // Sleep for 1 second between prints
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        logger.log(Level.WARNING, "Interrupted!", e);
                        Thread.currentThread().interrupt();
                    }
            }
        }

}
