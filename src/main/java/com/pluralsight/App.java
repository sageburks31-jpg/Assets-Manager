package com.pluralsight;

import java.math.BigDecimal;
import java.time.LocalDate;

public class App {


    public static void main(String[] args) {

        House goodHouse = new House();
        goodHouse.setCondition(2);
        goodHouse.setSquareFoot(1800);
        goodHouse.setLotSize(6000);
        System.out.println(goodHouse.houseToRow());

        Vehicle vehicle = new Vehicle();
        vehicle.setOdometer(100000);
        vehicle.setOriginalCost(new BigDecimal("20000"));
        vehicle.setYear(2);
        System.out.println(vehicle.vehicleToRow());

    }


}