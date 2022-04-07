package oops.concepts.polymorphism.compiletime;

public class Facebook {


    public static void login(String username, String password){
        System.out.println("Username is " + username + "Password is " +password);
    }
    public static void login(int appleID){
        System.out.println("Apple id is " + appleID);

    }
    public static String login(int uid, String pwd){
        System.out.println("Username is " + uid + "Password is" + pwd);

        return new String("as");
    }

//    public static void main(String[] args) {
//        login(3,"sdfsdf");
//    }
}
