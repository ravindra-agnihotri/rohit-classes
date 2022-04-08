package oops.concepts.abstraction;

public class Rohit extends TeamLead implements Manager{

    public static void main(String[] args) {
       TeamLead.resign();
       TeamLead teamLead= new Rohit("ssd");
       TeamLead.cpa();


       }

    public Rohit(String aa) {
        super(aa);
    }

    @Override
    public void testcaseWriting() {

    }

    @Override
    public void execution() {

    }

    @Override
    public void scrumCall() {

    }

   /* @Override
    public void cpa() {
        System.out.println("CPA rohit");
    }*/


}
