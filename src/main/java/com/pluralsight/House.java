package com.pluralsight;

import java.math.*;

public class House extends Asset {
    String address;
    int condition;
    int squareFoot;
    int lotSize;

    public House() {
        System.out.println("House");
        setAddress("address not found");
        setCondition(0);
        setSquareFoot(0);
        setLotSize(0);
    }
    public House(String address, int condition, int squareFoot, int lotSize) {
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public House(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
        setAddress("address not found");
        setCondition(0);
        setSquareFoot(0);
        setLotSize(0);
    }
    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public int getCondition() {return condition;}
    public void setCondition(int condition) {this.condition = condition;}
    public String getCondition(int condition){
        return switch (getCondition()) {
            case 1 -> "excellent";
            case 2 -> "good";
            case 3 -> "fair";
            case 4 -> "poor";
            default -> "unknown: "+getCondition();
        };
    }
    public double getConditionPrice() {
        return switch (condition) {
            case 1 -> 180;
            case 2 -> 130;
            case 3 -> 90;
            case 4 -> 80;
            default -> getCondition();

        };
    }

    public int getSquareFoot() {return squareFoot;}
    public void setSquareFoot(int squareFoot) {
        System.out.println("setSquareFoot");
        this.squareFoot = squareFoot;}

    public int getLotSize() {
        System.out.println("getLotSize");
        return lotSize;}
    public void setLotSize(int lotSize) {this.lotSize = lotSize;}

    @Override
    public BigDecimal getBigDecimalValue() {
        return new BigDecimal((getConditionPrice() * getSquareFoot()) + (0.25 * getLotSize()));
    }

    public String houseToRow(){
        return String.format(" address: %s | condition: %d(%s) | squareFoot: %d | lotSize: %d | Price: %s %s",
                getAddress(),
                getCondition(),
                getCondition(condition),
                getSquareFoot(),
                getLotSize(),
                getBigDecimalValue(),
                "|"+assetToRow());
    }
}
