package excercise.polymorphismPractice.compiletimePractice;

public class Game {
    public static void signIn(String username, String password){
        System.out.println("Username is " + username + "Password is " + password);

    }
    public static void signIn(int googleId){
        System.out.println("GoogleID is " + googleId);

    }
    public static String signIn(int userid, String pwd){
        System.out.println("UserID is " + userid + "Pass is " + pwd);

        return new String("abc");
    }


//    public static void main(String[] args) {
//        signIn(3,"sdfsdf");
//    }
}

