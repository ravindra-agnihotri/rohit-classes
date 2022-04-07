package oops.concepts.encapsulation;

public class HDFC {

    //having a private var in class(which cannot be called ouside of class
    //and accessing its value by means of getter and setter methods

    //final - means its value cannot be changed anytime during execution
    private static boolean rohitKaDecision = false;

    private  int mobileNumber= 545451652;

    public int getMobileNumber() {
        String string = new String("rohit");
        return mobileNumber;
    }

    public void setMobileNumber(int newMNo) {
        mobileNumber = newMNo;
    }

    public void oneCode(){
        mobileNumber = 45435
;    }
}
