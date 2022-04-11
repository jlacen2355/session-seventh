package day10;

public class StringPractice {

    public static void main(String[] args) {

        String s1 = "James"; // point to the same location as s3

        String s2 = new String("James");

        String s3 = "James"; // point to the same location as s1

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        String greeting = "Hello";
        String s = greeting.substring(0, 3);
        System.out.println(s);

        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive.concat(PG13);
        System.out.println(message);

        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);

        //Don't use this
        String allAnother = "S" + " / " + "M" + " / " + "L" + " / " + "XL";
        System.out.println(allAnother);

        String repeated = "Java ".repeat(100);
        System.out.println(repeated);

        //String Builder More easy
        StringBuilder sb = new StringBuilder();
        sb.append("S");
        sb.append("/");
        sb.append("M");
        sb.append("/");
        sb.append("L");
        sb.append("/");
        sb.append("XL");

        String concatinatedString = sb.toString();
        System.out.println(concatinatedString);

        for(int i=0; i < 100; i++){
            sb.append("Java ");
        }

        System.out.println(sb);


    }

}
