package com.pluralsight.finance;

import java.util.ArrayList;

public class Portfolio {
    //field
    private String name;
    private String owner;
    private ArrayList<Valuable> assets = new ArrayList<>();

    //constructor
    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double totalValue = 0;

        for (Valuable asset : assets) {
            totalValue = totalValue + asset.getValue();
        }

        return totalValue;
    }

    @Override
    public String toString() {
        return "\nPortfolio{" +
                "\nName: '" + name + '\'' +
                "\nOwner: '" + owner + '\'' +
                "\nAssets: " + assets + '\'' +
                "\nTotal Portfolio Value: $" + getValue() +
                '}';
    }
}
