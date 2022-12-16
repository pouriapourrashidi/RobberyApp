package com.intermidiates.FinalProject;

public abstract class Person {

    private final String name;
    private String nickName;
    private int yearOfBorn;
    private String expertion;
    private Item[] items;


    protected Person(String name, String nickName, int yearOfBorn, String expertion, Item[] items) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.expertion = expertion;
        this.items=items;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public void printBioData(){
        System.out.println(this.getName()+" with this nickname "+this.getNickName()+" and the year of born is: "+
                this.yearOfBorn+ " is expert in "+ this.expertion + " carries these items: ");
        for (Item item:items ){
            System.out.println("- "+item.getName());
        }
    }
}
