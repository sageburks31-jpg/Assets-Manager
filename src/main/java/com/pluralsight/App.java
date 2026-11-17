package com.pluralsight;

public class App {


    public static void main(String[] args) {

        House goodHouse = new House();
        goodHouse.setCondition(2);
        goodHouse.setSquareFoot(1800);
        goodHouse.setLotSize(6000);
        System.out.println(goodHouse.houseToRow());

    }


}