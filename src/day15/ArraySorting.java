package day15;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {


        int[] numbers = {8,5,1,2,9,7};

        Arrays.sort(numbers);

        for(int number : numbers){
            System.out.println(number);
        }

        String[] alphabets = {"d", "e", "a", "c", "b"};

        Arrays.sort(alphabets);

        for(String alphabet : alphabets){
            System.out.println(alphabet);
        }

        //This is not working. Java is confused. we will see this thing in chapter 6
        User[] users =  {new User("James", "jlacen2355@gmail.com"), new User("ABC", "ABC@gmail.com")};
        Arrays.sort(users);
        for(User user : users){
            System.out.println(user);
        }

//        Comparable<User> userComparable = new Comparable<User>();
        Comparable<User> userComparable1 = new User("James", "jlace2355@hotmail.com");



    }
}
