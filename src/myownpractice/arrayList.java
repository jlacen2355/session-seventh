package myownpractice;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        //Creating an array list
        ArrayList<String> carriers = new ArrayList<String>();
        carriers.add("BST");
        carriers.add("ATT");
        carriers.add("VZW");
        carriers.add("SPR");
        System.out.println(carriers);

        //getting one item from the list
        System.out.println(carriers.get(0));

        //Change an Item in the array list
        System.out.println(carriers.set(1, "GFI"));

        //Removing an item
        System.out.println(carriers.remove(0));

        //Removing all items
        carriers.clear();

        //To get the size of arrayList
        System.out.println(carriers.size());





    }

}
