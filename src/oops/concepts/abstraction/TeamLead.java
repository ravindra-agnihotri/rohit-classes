package oops.concepts.abstraction;

public abstract class TeamLead {
public static String month;
    TeamLead(String name){
        month=name;

    }
    public abstract void testcaseWriting();

    public static void cpa(){
        System.out.println("fill cpa of"+month);
    }

    public  abstract void execution();

    public static void resign(){

    }





}
