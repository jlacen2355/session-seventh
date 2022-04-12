package day11;

public class EmptyString {

    public static void main(String[] args) {
        String emptyString = "";
        String emptyString1 = "  AB C  ";

        //don't use length method to check string for empty
        System.out.println(emptyString.length());
        System.out.println(emptyString1.length());

        //instead, use trim method
        System.out.println(emptyString.length());
        System.out.println(emptyString1.trim().length());

        //another method
        System.out.println(emptyString1.isEmpty());  // just checking length
        System.out.println(emptyString1.isBlank()); // checking length and trimming

    }

}
