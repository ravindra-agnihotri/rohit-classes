package oops.concepts.polymorphism.runtime;

import java.io.InputStream;

public class CallerClass {

    public static void main(String[] args) {
//        WaterTank.cleanTank();
//        WaterJar.cleanTank();
//
//        WaterTank watertank = new WaterTank();
//        watertank.serveWater();
//        watertank.storeWater();
//
//        WaterJar waterJar = new WaterJar();
//        waterJar.serveWater();
//        waterJar.storeWater();

        WaterTank waterTank= new WaterJar();
        waterTank.storeWater();
        waterTank.serveWater();
        waterTank.unique();







    }
}
