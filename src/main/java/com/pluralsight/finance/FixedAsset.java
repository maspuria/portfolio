package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable {
    //field members
    private String name;
    private double marketValue;

    //constructor
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public abstract double getValue();


}
