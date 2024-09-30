package org.example.variables;

import java.util.logging.Logger;

public class StaticBankExample {

    static Logger logger = Logger.getLogger("StaticBankExample");
    static Account account1 = new Account(1000);
    static Account account2 = new Account(1230);
    public static void main(String[] args) {

        logger.info("Total accounts created: " + Account.getTotalAccounts());

    }

}
