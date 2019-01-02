package pl.coderslab.model;

import java.util.List;

public class Order {
    private String dateOfReg;
    private String dateOfRepair;
    private String descriptProblem;
    private String descriptRepair;
    private double costOfRepair;
    private double costOfParts;
    private int workQuantity;
    private List<Order> lisOfOrders;

    public Order(String dateOfReg, String dateOfRepair, String descriptProblem, String descriptRepair, double costOfRepair, double costOfParts, int workQuantity, List<pl.coderslab.model.Order> order) {
        this.dateOfReg = dateOfReg;
        this.dateOfRepair = dateOfRepair;
        this.descriptProblem = descriptProblem;
        this.descriptRepair = descriptRepair;
        this.costOfRepair = costOfRepair;
        this.costOfParts = costOfParts;
        this.workQuantity = workQuantity;
        this.lisOfOrders = order;
    }

    public Order() {
    }

    public String getDateOfReg() {
        return dateOfReg;
    }

    public void setDateOfReg(String dateOfReg) {
        this.dateOfReg = dateOfReg;
    }

    public String getDateOfRepair() {
        return dateOfRepair;
    }

    public void setDateOfRepair(String dateOfRepair) {
        this.dateOfRepair = dateOfRepair;
    }

    public String getDescriptProblem() {
        return descriptProblem;
    }

    public void setDescriptProblem(String descriptProblem) {
        this.descriptProblem = descriptProblem;
    }

    public String getDescriptRepair() {
        return descriptRepair;
    }

    public void setDescriptRepair(String descriptRepair) {
        this.descriptRepair = descriptRepair;
    }

    public double getCostOfRepair() {
        return costOfRepair;
    }

    public void setCostOfRepair(double costOfRepair) {
        this.costOfRepair = costOfRepair;
    }

    public double getCostOfParts() {
        return costOfParts;
    }

    public void setCostOfParts(double costOfParts) {
        this.costOfParts = costOfParts;
    }

    public int getWorkQuantity() {
        return workQuantity;
    }

    public void setWorkQuantity(int workQuantity) {
        this.workQuantity = workQuantity;
    }
}
