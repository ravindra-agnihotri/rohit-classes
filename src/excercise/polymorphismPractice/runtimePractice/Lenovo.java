package excercise.polymorphismPractice.runtimePractice;

public class Lenovo {

    String name;

//    public Lenovo() {
//    }

    public Lenovo(String a) {
       this.name = a;
    }

    public void ram(int ram) {
        System.out.println("Rammmm is "+ram);
    }

    public void storage(int storage) {
        System.out.println("Storageeee is " + storage);
    }

    public void graphicsCard(int gc) {
        System.out.println("Graphicssss Card "+gc);
    }

    public void me(){
        System.out.println(name);
    }
}
