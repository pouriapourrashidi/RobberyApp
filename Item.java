package com.intermidiates.FinalProject;

public class Item {

    private String name;
    private double value;

    Item(String name,double value){
        this.name=name;
        this.value=value;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
