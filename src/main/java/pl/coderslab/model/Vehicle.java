package pl.coderslab.model;

public class Vehicle {
    private int id;
    private String carModel;
    private String carBrand;
    private String yearOfProduction;
    private int regNumber;
    private String dateOfTechReviev;

    public Vehicle(int id, String carModel, String carBrand, String yearOfProduction, int regNumber, String dateOfTechReviev) {
        this.id = id;
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.yearOfProduction = yearOfProduction;
        this.regNumber = regNumber;
        this.dateOfTechReviev = dateOfTechReviev;
    }

    public Vehicle(String carModel, String carBrand, String yearOfProduction, int regNumber, String dateOfTechReviev) {
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.yearOfProduction = yearOfProduction;
        this.regNumber = regNumber;
        this.dateOfTechReviev = dateOfTechReviev;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getDateOfTechReviev() {
        return dateOfTechReviev;
    }

    public void setDateOfTechReviev(String dateOfTechReviev) {
        this.dateOfTechReviev = dateOfTechReviev;
    }

    public Vehicle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
