package com.pluralsight.finance;

public class House extends FixedAsset {
    //field
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    //constructor
    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }

    @Override
    public String toString() {
        return "House{" +
                "yearBuilt=" + yearBuilt +
                ", squareFeet=" + squareFeet +
                ", bedrooms=" + bedrooms +
                '}';
    }
}
