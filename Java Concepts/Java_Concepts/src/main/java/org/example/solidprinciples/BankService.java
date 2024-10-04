package org.example.solidprinciples;

/**
 * {@link BankService} provides the services like deposit the amount and withdrawal of amount.
 * We can extend the notification functionality by creating new classes that implement
 *  the NotificationService interface without modifying the existing BankService. (OCP)
 */

public class BankService {

    private final Notification notificationService;
    private final Account account;

    /**
     * Constructor for {@link BankService}
     * @param account refers to {@link Account}
     * @param notificationService refers to {@link Notification}
     */
    public BankService(Account account, Notification notificationService) {
        this.account = account;
        this.notificationService = notificationService;
    }

    /**
     * Deposit is used to add
     * @param amount
     * to account balance and print the deposited amount
     */
    public void processDeposit(double amount) {
        account.deposit(amount);
        notificationService.notification("Deposit processed, Balance: " + account.getBalance());
    }

    /**
     * Withdrawal is used to deduct
     * {@param amount}
     * from account and print the deducted amount
     */
    public void processWithdrawal(double amount) {

        try {
            account.withdraw(amount);
            notificationService.notification("Withdrawal processed,Balance: " + account.getBalance());
        } catch (Exception e) {
            notificationService.notification("Withdrawal failed: " + e.getMessage());
        }

    }
}
