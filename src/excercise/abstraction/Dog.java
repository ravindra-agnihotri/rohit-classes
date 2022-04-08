package excercise.abstraction;

public class Dog extends Animal{


    @Override
    public void AnimalSound() {
        System.out.println("Sound is bhow bhow");
    }

    Dog(int number) {
        super(number);
    }

    @Override
    public void eat() {
        super.eat();
    }

}
