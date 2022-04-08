package excercise.abstraction;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Dog(10);
        animal.AnimalSound();
        animal.eat();
        Dog.sleep();
        Animal.sleep();
        animal.totalAge();

    }

}
