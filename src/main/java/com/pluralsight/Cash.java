package com.pluralsight;

import java.math.*;

public class Cash extends Asset {
    BigDecimal amount = new BigDecimal("0.0");

    public Cash() {}
    public Cash(BigDecimal amount) {
        this.amount = amount;
    }

    public Cash(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }
    public Cash(String description, String dateAcquired, BigDecimal originalCost, BigDecimal amount) {
        super(description, dateAcquired, originalCost);
        this.amount = amount;
    }

    public String cashToRow(){
        return String.format("amount: %.2f | %s",
                amount,
                assetToRow());
    }

    @Override
    public BigDecimal getValue() {
        return originalCost;
    }
}
