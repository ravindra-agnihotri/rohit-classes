package excercise.polymorphismPractice.runtimePractice;

public class Dell extends Lenovo{
    public void ram(int ram){

        System.out.println("Ram is "+ ram);
    }

    public void storage(int storage){

        System.out.println("Storage is " + storage);
    }

    public void graphicsCard(int gc){
        System.out.println("Graphics Card is " + gc);
    }
}
