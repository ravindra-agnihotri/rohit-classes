package oops.concepts.polymorphism.runtime;

public class WaterTank {

    //overriding is having same method name with same parameter and return type in child class also
    //a static method cannot be overridden

    public static void cleanTank(){
        System.out.println("in water tank - P");
    }

    public void storeWater(){
        System.out.println("in water tank - P");
    }

    public void serveWater(){
        System.out.println("in water tank - P");
    }

    public void unique(){
        System.out.println("in tank - P");
    }


}
