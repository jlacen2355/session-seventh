package day18.arraylimitationassignment;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayLimitationsAssignment {

    public static void main(String[] args) {

        int[] array = new int[]{ 1,2,3,4,5};

        //To decrease array size.......................
        int[] arrayNew = new int[array.length-1];
        int index = 2;
        int counter = 0;

        System.out.println(Arrays.toString(array));

        for(int x = 0; x < array.length; x++) {

            if(x != index){
                arrayNew[counter] = array[x];
                counter++;
            }
        }
        System.out.println(Arrays.toString(arrayNew));

        /*
        Limitations of Arrays
        -It is not resizable (Size of an array can't be modified)
        -It can't add or remove elements.
        -It wastes memory if it is declared in a larger size than the real size needed.
         */


//      Solution to array limitations - Use of ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

//      To increase array size use the array variable and .add(data to add)
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

//      To decrease array size use the array variable and .remove(index to be removed)
        numbers.remove(2);
        System.out.println(numbers);

    }


}
