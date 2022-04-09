package excercise.interfacing;

public class TwoWheelers extends FourWheelers implements Vehicles {
    public TwoWheelers( String ss) {
        super(ss);
    }

    @Override
    public void mileage() {
        System.out.println("Super duper mileage");

    }

    @Override
    public void headLights() {
        System.out.println("Whitefull lights");

    }

    @Override
    public void breaks() {
        System.out.println("quality breaks");
    }

    public static void main(String[] args) {
        FourWheelers fourWheelers = new TwoWheelers("Maruti");
        fourWheelers.mileage();
        FourWheelers.power();
        Vehicles vehicles= new TwoWheelers("dfgdgg");
        vehicles.headLights();


    }
}
