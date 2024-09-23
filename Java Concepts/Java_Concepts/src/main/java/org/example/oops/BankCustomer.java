package org.example.oops;

public class BankCustomer {
    protected String customerID;
    protected String customerName;

    public BankCustomer(String customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }
}
