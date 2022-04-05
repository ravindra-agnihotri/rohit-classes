package excercise.StaticAndNonStatic;

public class PuneFood {
    String s1 = "hot";
    static String s2 = "cold";
    int price1 = 1;
    static int price2 = 2;

    //PuneArea par = new PuneArea();

    // NON-STATIC METHODS//

    public void idli(){
        System.out.println("Non Static Idli is " + s1);
        System.out.println("Static Idli is " + s2);

    }
    public void dosa(String s3){
        System.out.println("Dosa is "+s3);
    }
    public void wada(){
        System.out.println("Price of non static wada is " + price1);
        System.out.println("Price of static wada is " + price2);

    }
    public void uttappa(int i3){
        System.out.println("Price of utthapa is " + 3);
        System.out.println("--------------------------------------");

    }

    // STATIC METHODS//

    public static void pizza(){
        //System.out.println("Non Static Pizza is " + s1);
        System.out.println("Static Pizza is " + s2);

        //System.out.println("Price of non static wada is " + price1);
        System.out.println("Price of static wada is " + price2);
    }
    public static void burger(){
        System.out.println("This is Burger " + s2);

    }
    public static void sandwich(String s4){
        System.out.println("Sandwich is "+ s4);

    }
    public static void roll(int i4){
        System.out.println("Price of roll is "+ i4);

    }
    public static void fries(String s5, String s6){
        System.out.println("Fries is "+ s5 + " and "+ s6);

    }
    public static void momos(int i5, int i6){
        System.out.println("Prices of momos are "+ i5 + " and " + i6);
        System.out.println("--------------------------------------");


    }

}

