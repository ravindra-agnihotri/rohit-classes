package basics.accessmodifiers;

import javax.swing.*;
import java.io.File;

public class ClassCheck {

    // public = it can be accessed anywhere in project and outside project also
    public static String air= "everywhere";

    //private = it can be accessed only inside class nowhere outside it
    private static String gold= "50 tola";


    //protected = we can call the variable outside the class but within same package,
    // but for calling it outside package we need to create relation using extends keyword.
    protected static String mulgi="priti";

    //default = we can call it only within the same package. No where outside any package.
    static String aDefault="only in package";





    public static void main(String[] args) {
        System.out.println(gold);
    }

    public void met(){
        System.out.println(gold);
    }





}
