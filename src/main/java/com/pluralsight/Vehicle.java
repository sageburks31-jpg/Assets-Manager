package com.pluralsight;

import java.math.BigDecimal;

public class Vehicle extends Asset {

    String makeModel;
    int year;
    int odometer;

    public Vehicle() {
        setMakeModel("makeModel not found");
        setOdometer(-1);
        setYear(1111);
    }
    public Vehicle(String makeModel, int year, int odometer) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
        setMakeModel("makeModel not found");
        setOdometer(-1);
        setYear(1111);
    }
    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {return makeModel;}
    public void setMakeModel(String makeModel) {this.makeModel = makeModel;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public int getOdometer() {return odometer;}
    public void setOdometer(int odometer) {this.odometer = odometer;}

    public String vehicleToRow(){
        return String.format("makeModel: %s | %d | %d %s",
                getMakeModel(),
                getOdometer(),
                getYear(),
                "|"+assetToRow());
    }
}
