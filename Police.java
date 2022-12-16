package com.intermidiates.FinalProject;

import java.util.Random;

public class Police {

    private Detective adamSandler;

    Police(){
        Item[] item = new Item[2];
        item[0]=new Item("Gun",120);
        item[1]=new Item("Magnifier",10);

        adamSandler=new Detective("Adam","Spy",1980,"Smelling",item);
    }

    private boolean areCriminalCaught(){
        Random rand = new Random();
        if (rand.nextInt(101)>adamSandler.getSuccess_percentage()){
            return false;
        }else {
            return true;
        }
    }

    public void catchCriminal(Gang gang){
        System.out.println(adamSandler.getName() + " tries to catch criminals");
        if (areCriminalCaught()){
            System.out.println("and he was successful");
            if (gang.getSumStolen()>0){
                System.out.println("he could bring back "+gang.getSumStolen()+" to trejetory");
            }else{
                System.out.println("However, the thieve didn't stole anything");
            }
        }
        else{
            System.out.println("Criminals are smart and run away");
            System.out.println("Stolen items worth " + gang.getSumStolen());
        }
    }

}
