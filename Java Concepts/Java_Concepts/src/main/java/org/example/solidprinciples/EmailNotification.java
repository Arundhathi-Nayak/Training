package org.example.solidprinciples;

import java.util.logging.Logger;

public class EmailNotification implements Notification {

    static Logger logger = Logger.getLogger("EmailNotification");

    @Override
    public void notification(String message) {
        logger.info(()->"Email:"+message);

    }
}
