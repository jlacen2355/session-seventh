package day13;

public class ConditinalStatement {

    public static void main(String[] args) {
        int sales = 20;
        int target = 10;

        //Simple If Statement
//        if(sales >= target){
//        String performance = "Satisfactory";
//            System.out.println("Congratulations !! you will get bonus of 100");
//        }

//        String performance = "";
//        //IF ELSE Statement
//        if(sales >= target){
//            performance = "Satifactory";
//            System.out.println("Congratulations !! you will get bonus of 100");
//        }
//        else {
//            performance = "Not Satifactory";
//            System.out.println("You are fired :@");
//        }

        //IF ELSEIF

        if(sales >= 2 * target){
            System.out.println("Congratulations !! you will get bonus of 1000");
        }else if(sales >= 1.5 * target){
            System.out.println("Congratulations !! you will get bonus of 500");
        }else if(sales >= target){
            System.out.println("Congratulations !! you will get bonus of 100");
        }else {
            System.out.println("You are fired :@");
        }

        System.out.println("I am the last line of code");

    }
}
