package com.intermidiates.FinalProject;

public class RobApp {
    public static void main(String[] args) {
        Gang gangs = new Gang();
        Police detective = new Police();
        City gatham = new City();

        gangs.printGangInfo();
        gangs.letsRob(gatham.getBuildings());

        detective.catchCriminal(gangs);

    }

}
