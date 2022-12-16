package com.intermidiates.FinalProject;

import java.util.Random;

public class Gang {

    Criminal[] criminal = new Criminal[2];
    private double sumStolen;

    Gang(){
        Item[] Robitems = new Item[2];
        Robitems[0]=new Item("Knife",2.6);
        Robitems[1]=new Item("Ring",1.2);
        this.criminal[0]=new Criminal("Rob","Head",1990,"Smart",Robitems);

        Item[] bobbyitems = new Item[2];
        bobbyitems[0]=new Item("bat",4);
        bobbyitems[1]=new Item("spoon",1);
        this.criminal[1]=new Criminal("Booby","Muscle",1995,"Heavy",bobbyitems);
    }

    public double getSumStolen() {
        return sumStolen;
    }

    public void printGangInfo(){
        for (Criminal c: this.criminal ){
            c.printBioData();
        }
    }

    private boolean isSuccessfulRobbery(){
        int chance=0;
        Random rand = new Random();
        for (Criminal c: this.criminal ){
            chance+=c.getSuccess_percentage();
        }
        int chnaceOfRobbery = rand.nextInt(101);
        if (chnaceOfRobbery>chance){
            return false;
        }else{
            return true;
        }
    }

    public void letsRob(Buildings[] buildings){
        Random rand = new Random();
        int buildingIndex = rand.nextInt(buildings.length);
        if (isSuccessfulRobbery()){
            System.out.println("Gang was successful in robbery");
            for (Item items:buildings[buildingIndex].getItems()){
                this.sumStolen+=items.getValue();
                System.out.println("This item has been stolen: "+items.getName());
            }

        }else{
            System.out.println("Gang Failed");
        }

    }
}
