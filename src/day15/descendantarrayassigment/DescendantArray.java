package day15.descendantarrayassigment;

import java.util.Arrays;
import java.util.Collections;

public class DescendantArray {

    public static void main(String[] args) {

        // Example Array for demostration
        int[] counter = {5,9,6,1,7,4,3,8,2,};
        System.out.println("Example Array for demostration : " + Arrays.toString(counter) );


        //first is the sorted Array (Increasing)
        Arrays.sort(counter);
        System.out.println("The numbers are sorted (increasing way)...");

        for(int count : counter){
            System.out.println(count);
        }


        //Second is the reversed Array (descendant)
        System.out.println("The numbers are sorted in reversed (decreasing way)...");
        int[] counter2 = new int[counter.length];

        for(int i = 0; i < counter.length; i++){

            int decrease = counter.length - 1 - i;
            counter2[i] = counter[decrease];
            System.out.println(counter2[i]);

        }



    }

}
