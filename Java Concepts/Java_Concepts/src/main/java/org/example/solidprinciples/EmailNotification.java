package org.example.solidprinciples;

import java.util.logging.Logger;

/**
 * {@link EmailNotification} used to send the email Notification
 */
public class EmailNotification implements Notification {

    static Logger logger = Logger.getLogger("EmailNotification");

    /**
     * @param message
     *  Used to display the message
     */
    @Override
    public void notification(String message) {
        logger.info(()->"Email:"+message);

    }
}
