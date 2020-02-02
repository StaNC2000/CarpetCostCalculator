package com.eS;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {

        double totalCost = floor.getArea() * carpet.getCost();

        return totalCost;

    }

}
