package com.pluralsight.finance;

public class Gold extends FixedAsset {
    //field
    private double weight;

    //constructor
    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }

    @Override
    public String toString() {
        return "Gold{" + getName() + '\'' +
                "weight=" + weight +
                '}';
    }
}
