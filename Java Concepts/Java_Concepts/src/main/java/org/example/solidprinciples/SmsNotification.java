package org.example.solidprinciples;

import java.util.logging.Logger;

/**
 * {@link SmsNotification} used to send the email Notification
 */
public class SmsNotification implements Notification {

    static Logger logger = Logger.getLogger(SmsNotification.class.getName());

    /**
     * @param message
     * Used to display the message
     */

    @Override
    public void notification(String message) {
      logger.info(()->"SMS: "+message);
    }

}
