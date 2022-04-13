package myownpractice;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

    public static void main(String[] args) {

        //Creating an array list with String Object
        ArrayList<String> carriers = new ArrayList<String>();
        carriers.add("BST");
        carriers.add("ATT");
        carriers.add("VZW");
        carriers.add("SPR");
        System.out.println(carriers);

        //getting one item from the list
        System.out.println(carriers.get(0));

        //Change an Item in the array list
        carriers.set(1, "GFI");
        System.out.println(carriers.get(1));

        //Removing an item
        carriers.remove(0);
        System.out.println(carriers);
        System.out.println("........................");

        //Removing all items
        //carriers.clear();
        //System.out.println(carriers);

        //To get the size of arrayList
        System.out.println(carriers.size());
        System.out.println("........................");

        //Using For Loop to display arrayList items
        for (int i = 0; i < carriers.size(); i++) {
            System.out.println(carriers.get(i));
        }
        System.out.println("........................");

        //Using For each loop
        for (String i : carriers) {
            System.out.println(i);
        }
        System.out.println("........................");

        //Sorting an arrayList
        Collections.sort(carriers);  // Sort cars
        for (String i : carriers) {
            System.out.println(i);
        }
        System.out.println("........................");

        //Creating an array list with Integer Object
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }
        System.out.println("........................");


    }

}
