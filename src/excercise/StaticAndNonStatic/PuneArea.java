package excercise.StaticAndNonStatic;

public class PuneArea {
    String weather1 = "hot weather";
    static String weather2 = "cold weather";
    int population1 = 8000;
    static int population2 = 9000;

    String tutor;
    //String oneString; "defining" one string variable whose data type is String
    //String oneString= "value"; ---initializing value of oneString


//    public PuneArea(){
//
//    }
//    PuneArea(String givenName){
//        this.tutor= givenName;
//    }
//
//    public String getTutor() {
//        return tutor;
//    }

    // NON-STATIC METHODS//

    public void kothrud(){
        System.out.println("Non Static Kothrud is  " + weather1);
        System.out.println("Static Idli is " + weather2);

    }
    public void warje(String weather3){
        System.out.println("Warje is "+weather3);
    }
    public void magarpatta(){
        System.out.println("Population of non static magarpatta is " +population1);
        System.out.println("Population of static magarpatta is " + population2);

    }
    public void KP(int population3){
        System.out.println("Population of KP is " + population3);
        System.out.println("--------------------------------------");

    }

    // STATIC METHODS//

    public static void hinjewadi(){
        //System.out.println("Non Static hinjewadi is " +w);
        System.out.println("Static hinjewadi is " +weather2);

        //System.out.println("Populatin of non static hinjewadi is " +w);
        System.out.println("Populatin of non static hinjewadi is " +weather2);
    }
    public static void pimpri(){
        System.out.println("Weather of Pimpri " + weather2);

    }
    public static void sangavi(String s4){
        System.out.println("Weather of sangavi is "+weather2);

    }
    public static void wakad(int population4){
        System.out.println("Population os wakad is "+ population4);

    }
    public static void dhayari(String weather5, String weather6){
        System.out.println("Weather of dhayari is "+ weather5 + " and "+ weather6);

    }
    public static void katraj(int population5, int population6){
        System.out.println("Population of katraj are "+ population5 + " and " + population6);
        System.out.println("--------------------------------------");


    }


}
