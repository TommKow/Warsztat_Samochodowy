package pl.coderslab.model;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private List<Customer> CustomerList;

    public Customer(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Customer setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public List<Customer> getCustomerList() {
        return CustomerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        CustomerList = customerList;
    }
}
