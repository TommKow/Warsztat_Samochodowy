package pl.coderslab.model;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String dataEmployee;
    private int phoneNumber;
    private double salaryPh;
    private List<Employee> employeeList;

    public Employee(int id, String name, String surname, String email, String dataEmployee, int phoneNumber, double salaryPh) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dataEmployee = dataEmployee;
        this.phoneNumber = phoneNumber;
        this.salaryPh = salaryPh;

    }
    public Employee(String name, String surname, String email, String dataEmployee, int phoneNumber, double salaryPh) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dataEmployee = dataEmployee;
        this.phoneNumber = phoneNumber;
        this.salaryPh = salaryPh;
    }


    public String getDataEmployee() {
        return dataEmployee;
    }

    public void setDataEmployee(String dataEmployee) {
        this.dataEmployee = dataEmployee;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalaryPh() {
        return salaryPh;
    }

    public void setSalaryPh(double salaryPh) {
        this.salaryPh = salaryPh;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
        return this;
    }
}
