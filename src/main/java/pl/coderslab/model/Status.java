package pl.coderslab.model;

public class Status {
    private int id;
    private boolean isAccepted;
    private boolean isAprroveCostRepair;
    private boolean isRepair;
    private boolean isReadyToReceive;
    private boolean isResignation;

    public Status(int id, boolean isAccepted, boolean isAprroveCostRepair, boolean isRepair, boolean isReadyToReceive, boolean isResignation) {
        this.id = id;
        this.isAccepted = isAccepted;
        this.isAprroveCostRepair = isAprroveCostRepair;
        this.isRepair = isRepair;
        this.isReadyToReceive = isReadyToReceive;
        this.isResignation = isResignation;
    }

    public Status() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public boolean isAprroveCostRepair() {
        return isAprroveCostRepair;
    }

    public void setAprroveCostRepair(boolean aprroveCostRepair) {
        isAprroveCostRepair = aprroveCostRepair;
    }

    public boolean isRepair() {
        return isRepair;
    }

    public void setRepair(boolean repair) {
        isRepair = repair;
    }

    public boolean isReadyToReceive() {
        return isReadyToReceive;
    }

    public void setReadyToReceive(boolean readyToReceive) {
        isReadyToReceive = readyToReceive;
    }

    public boolean isResignation() {
        return isResignation;
    }

    public void setResignation(boolean resignation) {
        isResignation = resignation;
    }
}
