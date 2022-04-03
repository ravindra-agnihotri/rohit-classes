package oops.concepts.inheritance;

public class ChildOfChild extends Child {


    String cycle = "Mac1";
    public  static void main(String[] args) {
     childs();
     mixer();
     Parent parent= new Parent();
     parent.tv();
     Child child= new Child();
     child.tv();
     child.childsNs();
     ChildOfChild childOfChild= new ChildOfChild();
     childOfChild.childOdChildNs();
     //jbhsdfhbsdf
    }

    public static void childOdChild(){}

    public  void childOdChildNs(){}






}
