package excercise.interfacing;

public abstract class FourWheelers {
    public static String vehicleName;

    public FourWheelers(String name) {
        vehicleName=name;
    }

    public static void power(){
        System.out.println("Full Power");
    }
    public abstract void mileage();


}
