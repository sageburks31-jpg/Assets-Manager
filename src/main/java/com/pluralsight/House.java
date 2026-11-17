package com.pluralsight;

import java.math.*;

public class House extends Asset {
    String address;
    int condition;
    int squareFoot;
    int lotSize;

    public House() {
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

    public int getSquareFoot() {return squareFoot;}
    public void setSquareFoot(int squareFoot) {this.squareFoot = squareFoot;}

    public int getLotSize() {return lotSize;}
    public void setLotSize(int lotSize) {this.lotSize = lotSize;}

    public String houseToRow(){
        return String.format(" address: %s | condition: %d | squareFoot: %d | lotSize: %d %s",
                getAddress(),
                getCondition(),
                getSquareFoot(),
                getLotSize(),
                "|"+assetToRow());
    }
}
