package day15.descendantarrayassigment;

import java.util.Arrays;
import java.util.Collections;

public class DescendantArray {

    public static void main(String[] args) {

        // Example Array for demostration
//        int[] counter = {5,9,6,1,7,4,3,8,2,};
        Integer counter[] = {5,9,6,1,7,4,3,8,2,};

        //first is the sorted Array (Increasing)
        Arrays.sort(counter);
        System.out.println("The numbers are sorted (increasing way)...");

        for(int count : counter){
            System.out.println(count);
        }

        //Second is the reversed Array (descendant)
        Arrays.sort(counter, Collections.reverseOrder());
        System.out.println("The numbers are sorted in reversed (decreasing way)...");

        for(int count : counter){
            System.out.println(count);
        }






    }

}
