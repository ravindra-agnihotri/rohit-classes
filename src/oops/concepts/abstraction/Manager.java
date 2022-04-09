package oops.concepts.abstraction;

import java.nio.channels.InterruptibleChannel;

public interface Manager  {

    /*
    Any method is by default public and abstract
    Vars are by default public/static and final
    Constructor is not allowed in interface, as there is no body in the method as all methods are abstract by default.
    and interface static method should have body.

     */

    int var=9;
    void scrumCall();
}
