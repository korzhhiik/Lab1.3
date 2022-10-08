package com.main.fourth;

public class Invoice {
    private final int account;
    private final String customer;
    private final String provider;

    private String article;
    private int quantity;

    public Invoice(int account, String customer, String provider) {
        this.account = account;
        this.customer = customer;
        this.provider = provider;
    }

    public String calculateWithTax(int tax) {
        quantity -= tax;
        return "Calculate with tax " + quantity;
    }

    public String calculateWithoutTax() {
        return "Calculate without tax " + quantity;
    }
}
