package excercise.abstraction;

public abstract class Animal {

public static int age;
public abstract void AnimalSound();

Animal(int number)
{
    age=number;
}

    public void eat()
    {
        System.out.println("Veg");
    }

    public static void sleep()
    {
        System.out.println("Zzzz");
    }

    public void totalAge(){
        System.out.println("Total age is "+ age);
    }
}
