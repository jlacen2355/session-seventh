package day24;

import java.util.logging.Logger;

public class SomeApplication {

    public static void main(String[] args) {

        User user1 = new User("ABC", 16);

        try {
            //open database
            user1.registerUser();
        }catch (Exception ex){
            ex.printStackTrace();
            Logger.getGlobal(ex.getMessage());
        }finally {
            System.out.println("Finally block is getting called");
            //close database
        }

//        User user2 = new User("DEF", 18);
//
//         try {
//            user2.registerUser();
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }finally {
//
//         }
    }

}
