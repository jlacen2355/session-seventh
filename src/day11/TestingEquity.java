package day11;

public class TestingEquity {

    public static void main(String[] args) {

//        int a = 3;
//        int b =3;
//        boolean isEqual = a == b;
//        System.out.println(isEqual);

        String greeting = "Hello";
//        boolean isEqual1 = greeting == "Hello";
//        System.out.println(isEqual1);

//        String subString = greeting.substring(0, 3);
//        System.out.println(subString);
////        boolean isEqual2 = subString == "Hel"; // check only for the location
//        boolean isEqual2 = subString.equals("Hel"); // check for value
//        System.out.println(isEqual2);

//        boolean isEqual3 = "hello".equals("Hello");
//        System.out.println(isEqual3);


        boolean isEqual3 = "hello".equalsIgnoreCase("Hello");
        System.out.println(isEqual3);



    }


}
