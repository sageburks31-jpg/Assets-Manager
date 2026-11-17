package com.pluralsight;

import java.math.*;
import java.time.*;
import java.util.*;

public class App {

    static ArrayList<Asset> assetList = new ArrayList<>();

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

        goodHouse.setDescription("my house");
        assetList.add(goodHouse);

        House oldHouse = new House();
        oldHouse.setDescription("tom's house");
        assetList.add(oldHouse);

        vehicle.setDescription("toms truck");
        assetList.add(vehicle);

        Vehicle oldCar = new Vehicle();
        oldCar.setDescription("my car");
        assetList.add(oldCar);

        for (Asset asset: assetList){
            System.out.println(asset.assetToRow());
        }
    }


}