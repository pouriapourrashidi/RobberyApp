package com.intermidiates.FinalProject;

public class Buildings {
    private String name;
    private Item[] items;

    Buildings(String name,Item[] items){
        this.name=name;
        this.items=items;
    }

    public String getName() {
        return name;
    }

    public Item[] getItems() {
        return items;
    }
}
