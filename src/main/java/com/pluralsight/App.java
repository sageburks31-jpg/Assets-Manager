package com.pluralsight;

import java.math.*;
import java.time.*;
import java.util.*;

public class App {

    static ArrayList<Asset> assetList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        House goodHouse = new House();
        goodHouse.setCondition(2024);
        goodHouse.setSquareFoot(1800);
        goodHouse.setLotSize(6000);

        Vehicle vehicle = new Vehicle();
        vehicle.setOdometer(100000);
        vehicle.setOriginalCost(new BigDecimal("20000"));

        goodHouse.setDescription("my house");
        assetList.add(goodHouse);

        House oldHouse = new House();
        oldHouse.setDescription("tom's house");
        assetList.add(oldHouse);

        vehicle.setDescription("toms truck");
        assetList.add(vehicle);

        Cash cash = new Cash("cash under the mattress", "2026-11-18", new BigDecimal(promptToDecimal("enter money you have under bed \n Here -> ")));
        assetList.add(cash);

        Vehicle oldCar = new Vehicle();
        oldCar.setDescription("my car");
        assetList.add(oldCar);
        for (int i = 0; i < assetList.size(); i++) {
            switch (assetList.get(i).getClass().getSimpleName()){
                case "House" ->{
                    House j = (House) assetList.get(i);
                    if (i==0) {
                        j.setAddress("123 Main St, Austin, TX 78701");
                    } else {
                        j.setAddress("312 Main St, Buda, TX 87710");
                    }
                    System.out.println(j.houseToRow());
                }
                case "Vehicle" -> {
                    Vehicle j = (Vehicle) assetList.get(i);
                    if (i==2) {
                        j.setYear(2023);
                        j.setMakeModel("Honda");
                    } else {
                        j.setYear(2013);
                        j.setMakeModel("Gems");
                    }
                    System.out.println(j.vehicleToRow());
                }
                case "Cash" -> {
                    Cash j = (Cash) assetList.get(i);
                    System.out.println(j.cashToRow());
                }
            }
        }
    }

    public static double promptToDecimal(String prompt) {
        double result = 0;
        boolean isDouble = false;
        do {
            System.out.print(prompt);
            try {
                result = Double.parseDouble(scanner.nextLine());
                isDouble = true;
            } catch (Exception e) {
                System.out.println("Invalid command");
            }
        } while (!isDouble);
        return result;
    }

}