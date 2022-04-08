package oops.concepts.abstraction;

import java.nio.channels.InterruptibleChannel;

public interface Manager  {

    /*
    any method is by default public and abstract
    vars are by default public/static and final
    constructor is not allowed in interface, as there is no body in the method as all methods are abstract by default.
    And interface static method should have body.

     */

    int var=9;


    void scrumCall();


}
