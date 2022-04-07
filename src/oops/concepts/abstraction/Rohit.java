package oops.concepts.abstraction;

public class Rohit extends TeamLead{

    public static void main(String[] args) {
       TeamLead.resign();
       TeamLead teamLead= new Rohit("Jan");
       TeamLead.cpa();
       }

    public Rohit(String aa) {
        super(aa);
    }

   /* @Override
    public void cpa() {
        System.out.println("CPA rohit");
    }*/

    @Override
    public void testcaseWriting() {

    }

    @Override
    public void execution() {

    }
}
