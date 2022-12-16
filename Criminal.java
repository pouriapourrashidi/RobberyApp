package com.intermidiates.FinalProject;

public class Criminal extends Person{
    private final int success_percentage=20;


    Criminal(String name,String nickName,int yearOfBorn,String expertion, Item[] items) {
        super(name,nickName,yearOfBorn,expertion,items);
    }

    @Override
    public void printBioData() {
        super.printBioData();
        System.out.println(" Also his success rate is : "+this.success_percentage);
    }

    public int getSuccess_percentage(){
        return this.success_percentage;
    }
}
