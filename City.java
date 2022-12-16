package com.intermidiates.FinalProject;

public class City {

    private Buildings[] buildings = new Buildings[4];

    City(){
        Item[] bankItem = new Item[2];
        bankItem[0]=new Item("Couting Machine",3.5);
        bankItem[1]=new Item("Stamp",5);
        buildings[0] = new Buildings("Bank",bankItem);

        Item[] policeItem = new Item[2];
        policeItem[0]=new Item("Car",10);
        policeItem[1]=new Item("Gun",6.5);
        buildings[1] = new Buildings("Police Office",policeItem);

        Item[] universityItem = new Item[2];
        universityItem[0]=new Item("Computer",2);
        universityItem[1]=new Item("Desk",1);
        buildings[2] = new Buildings("University",universityItem);

        Item[] postItem = new Item[2];
        postItem[0]=new Item("Envelop",0.5);
        postItem[1]=new Item("Letters",6);
        buildings[3] = new Buildings("Post Office",postItem);
    }

    public Buildings[] getBuildings() {
        return buildings;
    }
}
