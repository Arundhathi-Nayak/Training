package org.example.oops;

public class PremierCustomer extends  BankCustomer{
    protected double premiumBalance;

    public PremierCustomer(String customerID, String customerName, double premiumBalance) {
        super(customerID, customerName);
        this.premiumBalance = premiumBalance;
    }

    protected void offerPremiumService() {  // protected method
        if (premiumBalance > 10000) {
            System.out.println("Offering premium service to " + customerName);
        }
    }
}
