package excercise.polymorphismPractice.runtimePractice;

public class LaptopMain {
    public static void main(String[] args) {
        Lenovo lenovo = new Dell("fdgdgfd");
        lenovo.graphicsCard(0);
        lenovo.ram(4);
        lenovo.storage(7);
        lenovo.me();



    }
}
