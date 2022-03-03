package me.whiteship.refactoring._06_mutable_data._19_ex;

import java.util.List;

public class Customer {

    private String name;

    private List<Invoice> invoices;

    public Customer(String name, List<Invoice> invoices) {
        this.name = name;
        this.invoices = invoices;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public String getName() {
        return name;
    }
}
