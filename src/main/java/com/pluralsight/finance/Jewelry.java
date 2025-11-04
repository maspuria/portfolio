package com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    // field
    private double karat;

    //constructor
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }

    @Override
    public String toString() {
        return "Jewelry{" +
                "karat=" + karat +
                '}';
    }
}
