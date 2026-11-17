package com.pluralsight;

import java.math.*;

public class Asset {

    String description;
    String dateAcquired;
    BigDecimal originalCost;

    public Asset() {
        setDescription("description not available");
        setDateAcquired("dateAcquired not found");
        setOriginalCost(new BigDecimal(0));
    }
    public Asset(String description, String dateAcquired, BigDecimal originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public String getDateAcquired() {return dateAcquired;}
    public void setDateAcquired(String dateAcquired) {this.dateAcquired = dateAcquired;}

    public BigDecimal getOriginalCost() {return originalCost;}
    public void setOriginalCost(BigDecimal originalCost) {this.originalCost = originalCost;}

    public String assetToRow(){
        return String.format(" description: %s | dateAcquired: %s | originalCost: %s",
                getDescription(),
                getDateAcquired(),
                getOriginalCost());
    }
}
