package excercise.StaticAndNonStatic;

public class PuneCompany {
    String reputation1 = "good";
    static String reputation2 = "bad";
    int hike1 = 10;
    static int hike2 = 20;

    // NON-STATIC METHODS//

    public void xento(){
        System.out.println("Non Static Xento is " + reputation1);
        System.out.println("Static Xento is " + reputation2);

    }
    public void tcs(String reputation3){
        System.out.println("Reputation od tcs is "+reputation3);
    }
    public void hcl(){
        System.out.println("Hike of non static HCL is " +hike1);
        System.out.println("Hike of static HCL is " +hike2);

    }
    public void dell(int hike3){
        System.out.println("Hike of Dell is " +hike3);
        System.out.println("--------------------------------------");

    }

    // STATIC METHODS//

    public static void capgemini(){
        //System.out.println("Non Static Capgemini is " +r);
        System.out.println("Static Capgemini is " + reputation2);

        //System.out.println("Hike of capgemini " + price1);
        System.out.println("Hike of capgemini is " + hike2);
    }
    public static void cognizant(){
        System.out.println("Reputation of cognizant " + reputation2);

    }
    public static void infosys(String reputation4){
        System.out.println("Reputation os infosys "+ reputation4);

    }
    public static void persistent(int hike4){
        System.out.println("Hike of persistent is "+ hike4);

    }
    public static void vodafone(String reputation5, String reputation6){
        System.out.println("Reputation of Vodafone is "+ reputation5 + " and "+ reputation6);

    }
    public static void wipro(int hike5, int hike6){
        System.out.println("Hike of wipro are "+ hike5 + " and " + hike6);
        System.out.println("--------------------------------------");


    }

}

