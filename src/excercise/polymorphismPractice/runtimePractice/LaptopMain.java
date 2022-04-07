package excercise.polymorphismPractice.runtimePractice;

public class LaptopMain {
    public static void main(String[] args) {
        Lenovo lenovo = new Dell();
        lenovo.ram(2);
        lenovo.storage(5);
        lenovo.graphicsCard(6);


    }
}
