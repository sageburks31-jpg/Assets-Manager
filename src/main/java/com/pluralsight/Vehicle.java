package com.pluralsight;

import java.awt.geom.Arc2D;
import java.math.BigDecimal;
import java.time.LocalDate;

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

    public double getUsedCost() {
//        double yearDifference = Double.parseDouble(String.valueOf(LocalDate.now().getYear())) - getYear() ;
        if (year<4) {
            return 0.03;
        } else if (year<7){
            return 0.06;
        } else if (year<11){
            return 0.08;
        }
        return 0;
    }

    public int getOdometer() {return odometer;}
    public void setOdometer(int odometer) {this.odometer = odometer;}

    @Override
    public BigDecimal getBigDecimalValue() {
        BigDecimal bigDecimal = new BigDecimal(1000);
        if (getUsedCost() != 0.0){
            bigDecimal = new BigDecimal(String.valueOf(Double.parseDouble(String.valueOf(getOriginalCost())) * (1 - year * getUsedCost())));
            if ((makeModel.equals("Honda")||makeModel.equals("Toyota")) && odometer>= 100000){
                return bigDecimal;
            } else {
               if (odometer>=100000) bigDecimal = new BigDecimal(String.valueOf(Double.parseDouble(String.valueOf(bigDecimal))*.25));
            }
        }
        return bigDecimal;
    }

    public String vehicleToRow(){
        return String.format("makeModel: %s | year: %d | odometer: %d | UsedCost: %s %s",
                getMakeModel(),
                getYear(),
                getOdometer(),
                getBigDecimalValue(),
                "|"+assetToRow());
    }
}
